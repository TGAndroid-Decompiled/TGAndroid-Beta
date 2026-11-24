package defpackage;

import android.os.Bundle;
public abstract class fz8 {
    public static final String a;

    static {
        String str = g8c.a;
        a = "0";
    }

    public static fz8 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        boolean z = false;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String str2 = knb.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z2 = false;
                        }
                        gre.f(z2);
                        if (bundle.getBoolean(knb.d, false)) {
                            return new knb(bundle.getBoolean(knb.e, false));
                        }
                        return new knb();
                    }
                    w26.j(de9.k(i, "Unknown RatingType: "));
                    return null;
                }
                String str3 = dra.d;
                if (bundle.getInt(str, -1) == 2) {
                    z = true;
                }
                gre.f(z);
                int i2 = bundle.getInt(dra.d, 5);
                float f = bundle.getFloat(dra.e, -1.0f);
                if (f == -1.0f) {
                    return new dra(i2);
                }
                return new dra(i2, f);
            }
            String str4 = e38.c;
            if (bundle.getInt(str, -1) == 1) {
                z = true;
            }
            gre.f(z);
            float f2 = bundle.getFloat(e38.c, -1.0f);
            if (f2 == -1.0f) {
                return new e38();
            }
            return new e38(f2);
        }
        String str5 = ud5.d;
        if (bundle.getInt(str, -1) != 0) {
            z2 = false;
        }
        gre.f(z2);
        if (bundle.getBoolean(ud5.d, false)) {
            return new ud5(bundle.getBoolean(ud5.e, false));
        }
        return new ud5();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
