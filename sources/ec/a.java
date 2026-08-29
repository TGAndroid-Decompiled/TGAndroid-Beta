package ec;

import h7.z7;
public final class a {
    public static final String[] f5857o = {"34", "37"};
    public static final String[] f5858p = {"60", "62", "64", "65"};
    public static final String[] f5859q = {"35"};
    public static final String[] f5860r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f5861s = {"4"};
    public static final String[] f5862t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f5863a;
    public final String f5864b;
    public final Integer f5865c;
    public final Integer d;
    public final String f5866e;
    public final String f5867f;
    public final String f5868g;
    public final String h;
    public final String f5869i;
    public final String f5870j;
    public final String f5871k;
    public String f5872l;
    public String f5873m;
    public final String f5874n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f5863a = z7.e(replaceAll);
        this.f5865c = num;
        this.d = num2;
        this.f5864b = z7.e(str2);
        this.f5866e = z7.e(str3);
        this.f5867f = z7.e(str4);
        this.f5868g = z7.e(str5);
        this.h = z7.e(str6);
        this.f5869i = z7.e(str7);
        this.f5870j = z7.e(str8);
        this.f5871k = z7.e(str9);
        this.f5873m = z7.a(str10) == null ? a() : str10;
        if (z7.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f5872l = str16;
        z7.e(str12);
        z7.b(str13);
        z7.e(str14);
        this.f5874n = z7.e(str15);
    }

    public final String a() {
        String str;
        if (z7.d(this.f5873m)) {
            String str2 = this.f5863a;
            if (!z7.d(str2)) {
                if (z7.c(str2, f5857o)) {
                    str = "American Express";
                } else if (z7.c(str2, f5858p)) {
                    str = "Discover";
                } else if (z7.c(str2, f5859q)) {
                    str = "JCB";
                } else if (z7.c(str2, f5860r)) {
                    str = "Diners Club";
                } else if (z7.c(str2, f5861s)) {
                    str = "Visa";
                } else if (z7.c(str2, f5862t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f5873m = str;
            }
        }
        return this.f5873m;
    }

    public final String b() {
        if (!z7.d(this.f5872l)) {
            return this.f5872l;
        }
        String str = this.f5863a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f5872l = substring;
            return substring;
        }
        return null;
    }
}
