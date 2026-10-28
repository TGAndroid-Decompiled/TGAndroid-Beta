package b2;

import a8.yb;
import android.os.Bundle;
public abstract class h1 {
    public static final String f3226a;

    static {
        String str = e2.n0.f9691a;
        f3226a = Integer.toString(0, 36);
    }

    public static h1 a(Bundle bundle) {
        String str = f3226a;
        int i10 = bundle.getInt(str, -1);
        boolean z10 = false;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        String str2 = k1.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z11 = false;
                        }
                        yb.g(z11);
                        if (bundle.getBoolean(k1.d, false)) {
                            return new k1(bundle.getBoolean(k1.e, false));
                        }
                        return new k1();
                    }
                    throw new IllegalArgumentException(ic.a.i(i10, "Unknown RatingType: "));
                }
                String str3 = i1.d;
                if (bundle.getInt(str, -1) == 2) {
                    z10 = true;
                }
                yb.g(z10);
                int i11 = bundle.getInt(i1.d, 5);
                float f7 = bundle.getFloat(i1.e, -1.0f);
                if (f7 == -1.0f) {
                    return new i1(i11);
                }
                return new i1(i11, f7);
            }
            String str4 = y0.f3598c;
            if (bundle.getInt(str, -1) == 1) {
                z10 = true;
            }
            yb.g(z10);
            float f10 = bundle.getFloat(y0.f3598c, -1.0f);
            if (f10 == -1.0f) {
                return new y0();
            }
            return new y0(f10);
        }
        String str5 = z.d;
        if (bundle.getInt(str, -1) != 0) {
            z11 = false;
        }
        yb.g(z11);
        if (bundle.getBoolean(z.d, false)) {
            return new z(bundle.getBoolean(z.e, false));
        }
        return new z();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
