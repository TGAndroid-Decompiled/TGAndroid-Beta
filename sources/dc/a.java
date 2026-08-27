package dc;

import g7.m7;

public final class a {

    public static final String[] f4889o = {"34", "37"};

    public static final String[] f4890p = {"60", "62", "64", "65"};

    public static final String[] f4891q = {"35"};

    public static final String[] f4892r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};

    public static final String[] f4893s = {"4"};

    public static final String[] f4894t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};

    public final String f4895a;

    public final String f4896b;

    public final Integer f4897c;
    public final Integer d;

    public final String f4898e;

    public final String f4899f;

    public final String f4900g;
    public final String h;

    public final String f4901i;

    public final String f4902j;

    public final String f4903k;

    public String f4904l;

    public String f4905m;

    public final String f4906n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f4895a = m7.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f4897c = num;
        this.d = num2;
        this.f4896b = m7.e(str2);
        this.f4898e = m7.e(str3);
        this.f4899f = m7.e(str4);
        this.f4900g = m7.e(str5);
        this.h = m7.e(str6);
        this.f4901i = m7.e(str7);
        this.f4902j = m7.e(str8);
        this.f4903k = m7.e(str9);
        this.f4905m = m7.a(str10) == null ? a() : str10;
        this.f4904l = m7.e(str11) == null ? b() : str11;
        m7.e(str12);
        m7.b(str13);
        m7.e(str14);
        this.f4906n = m7.e(str15);
    }

    public final String a() {
        String str;
        if (m7.d(this.f4905m)) {
            String str2 = this.f4895a;
            if (!m7.d(str2)) {
                if (m7.c(str2, f4889o)) {
                    str = "American Express";
                } else if (m7.c(str2, f4890p)) {
                    str = "Discover";
                } else if (m7.c(str2, f4891q)) {
                    str = "JCB";
                } else if (m7.c(str2, f4892r)) {
                    str = "Diners Club";
                } else if (m7.c(str2, f4893s)) {
                    str = "Visa";
                } else {
                    str = m7.c(str2, f4894t) ? "MasterCard" : "Unknown";
                }
                this.f4905m = str;
            }
        }
        return this.f4905m;
    }

    public final String b() {
        if (!m7.d(this.f4904l)) {
            return this.f4904l;
        }
        String str = this.f4895a;
        if (str == null || str.length() <= 4) {
            return null;
        }
        String strSubstring = str.substring(str.length() - 4, str.length());
        this.f4904l = strSubstring;
        return strSubstring;
    }
}
