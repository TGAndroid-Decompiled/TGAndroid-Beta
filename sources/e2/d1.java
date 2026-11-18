package e2;

import a8.la;
import android.os.Bundle;
public abstract class d1 {
    public static final String f10365a;

    static {
        String str = h2.l0.f13783a;
        f10365a = Integer.toString(0, 36);
    }

    public static d1 a(Bundle bundle) {
        String str = f10365a;
        int i7 = bundle.getInt(str, -1);
        boolean z10 = false;
        boolean z11 = true;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        String str2 = g1.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z11 = false;
                        }
                        la.f(z11);
                        if (bundle.getBoolean(g1.d, false)) {
                            return new g1(bundle.getBoolean(g1.f10416e, false));
                        }
                        return new g1();
                    }
                    throw new IllegalArgumentException(i5.c.i(i7, "Unknown RatingType: "));
                }
                String str3 = e1.d;
                if (bundle.getInt(str, -1) == 2) {
                    z10 = true;
                }
                la.f(z10);
                int i10 = bundle.getInt(e1.d, 5);
                float f10 = bundle.getFloat(e1.f10384e, -1.0f);
                if (f10 == -1.0f) {
                    return new e1(i10);
                }
                return new e1(i10, f10);
            }
            String str4 = u0.f10773c;
            if (bundle.getInt(str, -1) == 1) {
                z10 = true;
            }
            la.f(z10);
            float f11 = bundle.getFloat(u0.f10773c, -1.0f);
            if (f11 == -1.0f) {
                return new u0();
            }
            return new u0(f11);
        }
        String str5 = w.d;
        if (bundle.getInt(str, -1) != 0) {
            z11 = false;
        }
        la.f(z11);
        if (bundle.getBoolean(w.d, false)) {
            return new w(bundle.getBoolean(w.f10784e, false));
        }
        return new w();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
