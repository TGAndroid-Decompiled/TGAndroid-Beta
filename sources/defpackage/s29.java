package defpackage;

import android.os.Bundle;
public abstract class s29 {
    public static final String a;

    static {
        String str = gcc.a;
        a = "0";
    }

    public static s29 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        boolean z = false;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String str2 = krb.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z2 = false;
                        }
                        yve.f(z2);
                        if (bundle.getBoolean(krb.d, false)) {
                            return new krb(bundle.getBoolean(krb.e, false));
                        }
                        return new krb();
                    }
                    lq5.j(uh9.k(i, "Unknown RatingType: "));
                    return null;
                }
                String str3 = fva.d;
                if (bundle.getInt(str, -1) == 2) {
                    z = true;
                }
                yve.f(z);
                int i2 = bundle.getInt(fva.d, 5);
                float f = bundle.getFloat(fva.e, -1.0f);
                if (f == -1.0f) {
                    return new fva(i2);
                }
                return new fva(i2, f);
            }
            String str4 = u68.c;
            if (bundle.getInt(str, -1) == 1) {
                z = true;
            }
            yve.f(z);
            float f2 = bundle.getFloat(u68.c, -1.0f);
            if (f2 == -1.0f) {
                return new u68();
            }
            return new u68(f2);
        }
        String str5 = vf5.d;
        if (bundle.getInt(str, -1) != 0) {
            z2 = false;
        }
        yve.f(z2);
        if (bundle.getBoolean(vf5.d, false)) {
            return new vf5(bundle.getBoolean(vf5.e, false));
        }
        return new vf5();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
