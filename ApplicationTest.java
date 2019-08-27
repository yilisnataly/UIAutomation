package com.allianzassistance.b2ces.uat.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApplicationTest {

	@Test
	public void calculateInsuranceTest() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// Open test page
		String url = "https://b2c-es.uat.booking.allianz-assistance.com/iframe.html?angularparams=/TRAVEL/B2C/ES/es_ES/step-1";
		driver.get(url);

		// Sleep for 5 seconds
		sleep(5000);

		// Select the desired insurance coverage
		driver.findElement(By.xpath("//select[@id='typeOfCover']")).click();
		driver.findElement(By.xpath("//select[@id='typeOfCover']/optgroup/option[2]")).click();

		// Sleep for 3 seconds
		sleep(3000);

		// Type of travel
		driver.findElement(By.id("travelCategory")).click();
		driver.findElement(By.xpath("//option[contains(.,'No crucero')]")).click();

		// Sleep for 3 seconds
		sleep(3000);

		// Destination
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Bahamas')]")).click();

		// Sleep for 3 seconds
		sleep(3000);

		// Date of travel
		driver.findElement(By.cssSelector("input# travelDatesFrom ")).click();
		driver.findElement(By.id("openDatapicker")).click();
		driver.findElement(By.cssSelector("input# travelDatesTo ")).click();
		driver.findElement(By.id("openDatapicker")).click();

		// Sleep for 1 second
		sleep(1000);

		// Number of persons
		driver.findElement(By.tagName("button.btn.dropdown-toggle.btn-default")).click();
		driver.findElement(By.xpath("//a[contains(.,'2')]")).click();

		// Sleep for 3 seconds
		sleep(3000);

		// Calculate
		driver.findElement(By.id("submit")).click();

		// Close browser

		driver.quit();

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
