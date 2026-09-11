package b2;

import android.os.Bundle;
public abstract class c1 {
    public static final String f1990a;

    static {
        String str = e2.d0.f8737a;
        f1990a = Integer.toString(0, 36);
    }

    public static c1 a(Bundle bundle) {
        String str = f1990a;
        int i10 = bundle.getInt(str, -1);
        boolean z10 = false;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        String str2 = f1.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z11 = false;
                        }
                        e2.d.b(z11);
                        if (bundle.getBoolean(f1.d, false)) {
                            return new f1(bundle.getBoolean(f1.f2038e, false));
                        }
                        return new f1();
                    }
                    throw new IllegalArgumentException(i2.g.i(i10, "Unknown RatingType: "));
                }
                String str3 = d1.d;
                if (bundle.getInt(str, -1) == 2) {
                    z10 = true;
                }
                e2.d.b(z10);
                int i11 = bundle.getInt(d1.d, 5);
                float f7 = bundle.getFloat(d1.f1995e, -1.0f);
                if (f7 == -1.0f) {
                    return new d1(i11);
                }
                return new d1(i11, f7);
            }
            String str4 = t0.f2385c;
            if (bundle.getInt(str, -1) == 1) {
                z10 = true;
            }
            e2.d.b(z10);
            float f10 = bundle.getFloat(t0.f2385c, -1.0f);
            if (f10 == -1.0f) {
                return new t0();
            }
            return new t0(f10);
        }
        String str5 = u.d;
        if (bundle.getInt(str, -1) != 0) {
            z11 = false;
        }
        e2.d.b(z11);
        if (bundle.getBoolean(u.d, false)) {
            return new u(bundle.getBoolean(u.f2388e, false));
        }
        return new u();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
