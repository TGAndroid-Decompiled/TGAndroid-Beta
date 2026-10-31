package oc;

import w7.m7;
public final class a {
    public static final String[] f14124o = {"34", "37"};
    public static final String[] f14125p = {"60", "62", "64", "65"};
    public static final String[] f14126q = {"35"};
    public static final String[] f14127r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f14128s = {"4"};
    public static final String[] f14129t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f14130a;
    public final String f14131b;
    public final Integer f14132c;
    public final Integer d;
    public final String e;
    public final String f14133f;
    public final String f14134g;
    public final String h;
    public final String f14135i;
    public final String f14136j;
    public final String f14137k;
    public String f14138l;
    public String f14139m;
    public final String f14140n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f14130a = m7.e(replaceAll);
        this.f14132c = num;
        this.d = num2;
        this.f14131b = m7.e(str2);
        this.e = m7.e(str3);
        this.f14133f = m7.e(str4);
        this.f14134g = m7.e(str5);
        this.h = m7.e(str6);
        this.f14135i = m7.e(str7);
        this.f14136j = m7.e(str8);
        this.f14137k = m7.e(str9);
        this.f14139m = m7.a(str10) == null ? a() : str10;
        if (m7.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f14138l = str16;
        m7.e(str12);
        m7.b(str13);
        m7.e(str14);
        this.f14140n = m7.e(str15);
    }

    public final String a() {
        String str;
        if (m7.d(this.f14139m)) {
            String str2 = this.f14130a;
            if (!m7.d(str2)) {
                if (m7.c(str2, f14124o)) {
                    str = "American Express";
                } else if (m7.c(str2, f14125p)) {
                    str = "Discover";
                } else if (m7.c(str2, f14126q)) {
                    str = "JCB";
                } else if (m7.c(str2, f14127r)) {
                    str = "Diners Club";
                } else if (m7.c(str2, f14128s)) {
                    str = "Visa";
                } else if (m7.c(str2, f14129t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f14139m = str;
            }
        }
        return this.f14139m;
    }

    public final String b() {
        if (!m7.d(this.f14138l)) {
            return this.f14138l;
        }
        String str = this.f14130a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f14138l = substring;
            return substring;
        }
        return null;
    }
}
