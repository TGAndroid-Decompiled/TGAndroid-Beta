package d2;

import android.os.Bundle;
import b8.zb;
public abstract class f1 {
    public static final String f8107a;

    static {
        String str = g2.n0.f11873a;
        f8107a = Integer.toString(0, 36);
    }

    public static f1 a(Bundle bundle) {
        String str = f8107a;
        int i3 = bundle.getInt(str, -1);
        boolean z10 = false;
        boolean z11 = true;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        String str2 = i1.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z11 = false;
                        }
                        zb.f(z11);
                        if (bundle.getBoolean(i1.d, false)) {
                            return new i1(bundle.getBoolean(i1.f8145e, false));
                        }
                        return new i1();
                    }
                    throw new IllegalArgumentException(k2.p1.i(i3, "Unknown RatingType: "));
                }
                String str3 = g1.d;
                if (bundle.getInt(str, -1) == 2) {
                    z10 = true;
                }
                zb.f(z10);
                int i10 = bundle.getInt(g1.d, 5);
                float f10 = bundle.getFloat(g1.f8112e, -1.0f);
                if (f10 == -1.0f) {
                    return new g1(i10);
                }
                return new g1(i10, f10);
            }
            String str4 = w0.f8502c;
            if (bundle.getInt(str, -1) == 1) {
                z10 = true;
            }
            zb.f(z10);
            float f11 = bundle.getFloat(w0.f8502c, -1.0f);
            if (f11 == -1.0f) {
                return new w0();
            }
            return new w0(f11);
        }
        String str5 = x.d;
        if (bundle.getInt(str, -1) != 0) {
            z11 = false;
        }
        zb.f(z11);
        if (bundle.getBoolean(x.d, false)) {
            return new x(bundle.getBoolean(x.f8505e, false));
        }
        return new x();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
