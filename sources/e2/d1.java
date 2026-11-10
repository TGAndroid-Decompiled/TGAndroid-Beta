package e2;

import a8.ia;
import android.os.Bundle;
public abstract class d1 {
    public static final String f10219a;

    static {
        String str = h2.m0.f14114a;
        f10219a = Integer.toString(0, 36);
    }

    public static d1 a(Bundle bundle) {
        String str = f10219a;
        int i7 = bundle.getInt(str, -1);
        boolean z9 = false;
        boolean z10 = true;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        String str2 = g1.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z10 = false;
                        }
                        ia.f(z10);
                        if (bundle.getBoolean(g1.d, false)) {
                            return new g1(bundle.getBoolean(g1.f10270e, false));
                        }
                        return new g1();
                    }
                    throw new IllegalArgumentException(jg.g.j(i7, "Unknown RatingType: "));
                }
                String str3 = e1.d;
                if (bundle.getInt(str, -1) == 2) {
                    z9 = true;
                }
                ia.f(z9);
                int i10 = bundle.getInt(e1.d, 5);
                float f10 = bundle.getFloat(e1.f10238e, -1.0f);
                if (f10 == -1.0f) {
                    return new e1(i10);
                }
                return new e1(i10, f10);
            }
            String str4 = u0.f10627c;
            if (bundle.getInt(str, -1) == 1) {
                z9 = true;
            }
            ia.f(z9);
            float f11 = bundle.getFloat(u0.f10627c, -1.0f);
            if (f11 == -1.0f) {
                return new u0();
            }
            return new u0(f11);
        }
        String str5 = w.d;
        if (bundle.getInt(str, -1) != 0) {
            z10 = false;
        }
        ia.f(z10);
        if (bundle.getBoolean(w.d, false)) {
            return new w(bundle.getBoolean(w.f10638e, false));
        }
        return new w();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
