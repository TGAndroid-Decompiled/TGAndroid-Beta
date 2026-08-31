package gc;

import j7.q8;
public final class a {
    public static final String[] f6997o = {"34", "37"};
    public static final String[] f6998p = {"60", "62", "64", "65"};
    public static final String[] f6999q = {"35"};
    public static final String[] f7000r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f7001s = {"4"};
    public static final String[] f7002t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f7003a;
    public final String f7004b;
    public final Integer f7005c;
    public final Integer d;
    public final String f7006e;
    public final String f7007f;
    public final String f7008g;
    public final String h;
    public final String f7009i;
    public final String f7010j;
    public final String f7011k;
    public String f7012l;
    public String f7013m;
    public final String f7014n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f7003a = q8.e(replaceAll);
        this.f7005c = num;
        this.d = num2;
        this.f7004b = q8.e(str2);
        this.f7006e = q8.e(str3);
        this.f7007f = q8.e(str4);
        this.f7008g = q8.e(str5);
        this.h = q8.e(str6);
        this.f7009i = q8.e(str7);
        this.f7010j = q8.e(str8);
        this.f7011k = q8.e(str9);
        this.f7013m = q8.a(str10) == null ? a() : str10;
        if (q8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f7012l = str16;
        q8.e(str12);
        q8.b(str13);
        q8.e(str14);
        this.f7014n = q8.e(str15);
    }

    public final String a() {
        String str;
        if (q8.d(this.f7013m)) {
            String str2 = this.f7003a;
            if (!q8.d(str2)) {
                if (q8.c(str2, f6997o)) {
                    str = "American Express";
                } else if (q8.c(str2, f6998p)) {
                    str = "Discover";
                } else if (q8.c(str2, f6999q)) {
                    str = "JCB";
                } else if (q8.c(str2, f7000r)) {
                    str = "Diners Club";
                } else if (q8.c(str2, f7001s)) {
                    str = "Visa";
                } else if (q8.c(str2, f7002t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f7013m = str;
            }
        }
        return this.f7013m;
    }

    public final String b() {
        if (!q8.d(this.f7012l)) {
            return this.f7012l;
        }
        String str = this.f7003a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f7012l = substring;
            return substring;
        }
        return null;
    }
}
