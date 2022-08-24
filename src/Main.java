import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar, armutKg, armutFiyat = 2.14, elmaKg, elmaFiyat = 3.67, muzKg, muzFiyat = 0.95, domatesKg, domatesFiyat = 1.11, patlicanKg, patlicanFiyat = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut - Kaç KG Aldınız : ");
        armutKg = input.nextDouble();
        System.out.print("Elma - Kaç KG Aldınız : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates - Kaç KG Aldınız : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz - Kaç KG Aldınız : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan - Kaç KG Aldınız : ");
        patlicanKg = input.nextDouble();
        tutar = (armutFiyat * armutKg) + (elmaFiyat * elmaKg) + (domatesFiyat * domatesKg) + (muzFiyat * muzKg) + (patlicanFiyat * patlicanKg);
        System.out.println("Toplam Tutar : " + tutar);
    }
}
