package gc;

import j7.q8;
public final class a {
    public static final String[] f6502o = {"34", "37"};
    public static final String[] f6503p = {"60", "62", "64", "65"};
    public static final String[] f6504q = {"35"};
    public static final String[] f6505r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f6506s = {"4"};
    public static final String[] f6507t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f6508a;
    public final String f6509b;
    public final Integer f6510c;
    public final Integer d;
    public final String e;
    public final String f6511f;
    public final String f6512g;
    public final String h;
    public final String f6513i;
    public final String f6514j;
    public final String f6515k;
    public String f6516l;
    public String f6517m;
    public final String f6518n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f6508a = q8.e(replaceAll);
        this.f6510c = num;
        this.d = num2;
        this.f6509b = q8.e(str2);
        this.e = q8.e(str3);
        this.f6511f = q8.e(str4);
        this.f6512g = q8.e(str5);
        this.h = q8.e(str6);
        this.f6513i = q8.e(str7);
        this.f6514j = q8.e(str8);
        this.f6515k = q8.e(str9);
        this.f6517m = q8.a(str10) == null ? a() : str10;
        if (q8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f6516l = str16;
        q8.e(str12);
        q8.b(str13);
        q8.e(str14);
        this.f6518n = q8.e(str15);
    }

    public final String a() {
        String str;
        if (q8.d(this.f6517m)) {
            String str2 = this.f6508a;
            if (!q8.d(str2)) {
                if (q8.c(str2, f6502o)) {
                    str = "American Express";
                } else if (q8.c(str2, f6503p)) {
                    str = "Discover";
                } else if (q8.c(str2, f6504q)) {
                    str = "JCB";
                } else if (q8.c(str2, f6505r)) {
                    str = "Diners Club";
                } else if (q8.c(str2, f6506s)) {
                    str = "Visa";
                } else if (q8.c(str2, f6507t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f6517m = str;
            }
        }
        return this.f6517m;
    }

    public final String b() {
        if (!q8.d(this.f6516l)) {
            return this.f6516l;
        }
        String str = this.f6508a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f6516l = substring;
            return substring;
        }
        return null;
    }
}
