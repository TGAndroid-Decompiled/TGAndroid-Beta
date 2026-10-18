package b2;

import android.os.Bundle;
import v7.u6;
public abstract class g1 {
    public static final String f3772a;

    static {
        String str = e2.m0.f8255a;
        f3772a = Integer.toString(0, 36);
    }

    public static g1 a(Bundle bundle) {
        String str = f3772a;
        int i10 = bundle.getInt(str, -1);
        boolean z10 = false;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        String str2 = j1.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z11 = false;
                        }
                        u6.g(z11);
                        if (bundle.getBoolean(j1.d, false)) {
                            return new j1(bundle.getBoolean(j1.e, false));
                        }
                        return new j1();
                    }
                    throw new IllegalArgumentException(i2.d.j(i10, "Unknown RatingType: "));
                }
                String str3 = h1.d;
                if (bundle.getInt(str, -1) == 2) {
                    z10 = true;
                }
                u6.g(z10);
                int i11 = bundle.getInt(h1.d, 5);
                float f7 = bundle.getFloat(h1.e, -1.0f);
                if (f7 == -1.0f) {
                    return new h1(i11);
                }
                return new h1(i11, f7);
            }
            String str4 = x0.f4144c;
            if (bundle.getInt(str, -1) == 1) {
                z10 = true;
            }
            u6.g(z10);
            float f10 = bundle.getFloat(x0.f4144c, -1.0f);
            if (f10 == -1.0f) {
                return new x0();
            }
            return new x0(f10);
        }
        String str5 = y.d;
        if (bundle.getInt(str, -1) != 0) {
            z11 = false;
        }
        u6.g(z11);
        if (bundle.getBoolean(y.d, false)) {
            return new y(bundle.getBoolean(y.e, false));
        }
        return new y();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
