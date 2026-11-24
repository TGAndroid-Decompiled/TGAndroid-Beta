package defpackage;

import android.os.Bundle;
public abstract class g19 {
    public static final String a;

    static {
        String str = hac.a;
        a = "0";
    }

    public static g19 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        boolean z = false;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String str2 = lpb.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z2 = false;
                        }
                        jte.f(z2);
                        if (bundle.getBoolean(lpb.d, false)) {
                            return new lpb(bundle.getBoolean(lpb.e, false));
                        }
                        return new lpb();
                    }
                    u36.j(hg9.j(i, "Unknown RatingType: "));
                    return null;
                }
                String str3 = eta.d;
                if (bundle.getInt(str, -1) == 2) {
                    z = true;
                }
                jte.f(z);
                int i2 = bundle.getInt(eta.d, 5);
                float f = bundle.getFloat(eta.e, -1.0f);
                if (f == -1.0f) {
                    return new eta(i2);
                }
                return new eta(i2, f);
            }
            String str4 = g58.c;
            if (bundle.getInt(str, -1) == 1) {
                z = true;
            }
            jte.f(z);
            float f2 = bundle.getFloat(g58.c, -1.0f);
            if (f2 == -1.0f) {
                return new g58();
            }
            return new g58(f2);
        }
        String str5 = sf5.d;
        if (bundle.getInt(str, -1) != 0) {
            z2 = false;
        }
        jte.f(z2);
        if (bundle.getBoolean(sf5.d, false)) {
            return new sf5(bundle.getBoolean(sf5.e, false));
        }
        return new sf5();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
