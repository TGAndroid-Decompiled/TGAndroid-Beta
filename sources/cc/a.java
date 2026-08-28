package cc;

import f7.l7;
public final class a {
    public static final String[] f2345o = {"34", "37"};
    public static final String[] f2346p = {"60", "62", "64", "65"};
    public static final String[] f2347q = {"35"};
    public static final String[] f2348r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f2349s = {"4"};
    public static final String[] f2350t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f2351a;
    public final String f2352b;
    public final Integer f2353c;
    public final Integer d;
    public final String f2354e;
    public final String f2355f;
    public final String f2356g;
    public final String h;
    public final String f2357i;
    public final String f2358j;
    public final String f2359k;
    public String f2360l;
    public String f2361m;
    public final String f2362n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f2351a = l7.e(replaceAll);
        this.f2353c = num;
        this.d = num2;
        this.f2352b = l7.e(str2);
        this.f2354e = l7.e(str3);
        this.f2355f = l7.e(str4);
        this.f2356g = l7.e(str5);
        this.h = l7.e(str6);
        this.f2357i = l7.e(str7);
        this.f2358j = l7.e(str8);
        this.f2359k = l7.e(str9);
        this.f2361m = l7.a(str10) == null ? a() : str10;
        if (l7.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f2360l = str16;
        l7.e(str12);
        l7.b(str13);
        l7.e(str14);
        this.f2362n = l7.e(str15);
    }

    public final String a() {
        String str;
        if (l7.d(this.f2361m)) {
            String str2 = this.f2351a;
            if (!l7.d(str2)) {
                if (l7.c(str2, f2345o)) {
                    str = "American Express";
                } else if (l7.c(str2, f2346p)) {
                    str = "Discover";
                } else if (l7.c(str2, f2347q)) {
                    str = "JCB";
                } else if (l7.c(str2, f2348r)) {
                    str = "Diners Club";
                } else if (l7.c(str2, f2349s)) {
                    str = "Visa";
                } else if (l7.c(str2, f2350t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f2361m = str;
            }
        }
        return this.f2361m;
    }

    public final String b() {
        if (!l7.d(this.f2360l)) {
            return this.f2360l;
        }
        String str = this.f2351a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f2360l = substring;
            return substring;
        }
        return null;
    }
}
