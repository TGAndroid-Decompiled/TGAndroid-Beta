package defpackage;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;
public final class r1b {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public String t;
    public String u;
    public String v;
    public boolean w;
    public boolean x;
    public String y;
    public String z;

    public static lyc a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i = (int) (d - d2);
        if (d2 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i / ((float) d2)) * 100.0f);
        }
        String o0 = hl.o0((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z2 = true;
        String str = "";
        if (i != 0 && abs != 0.0f) {
            int i2 = (int) abs;
            if (abs == i2) {
                Locale locale = Locale.ENGLISH;
                if (i > 0) {
                    str = "+";
                }
                str = (str + hl.o0(i, 0)) + " (" + i2 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                if (i > 0) {
                    str = "+";
                }
                str = String.format(locale2, "%s (%.1f%s)", str + hl.o0(i, 0), Float.valueOf(abs), "%");
            }
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z2);
        lyc lycVar = new lyc((byte) 15, false);
        lycVar.b = o0;
        lycVar.c = str;
        lycVar.d = valueOf;
        lycVar.e = valueOf2;
        return lycVar;
    }
}
