package jd;
public abstract class g0 {
    public static final j0 f11480a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = od.w.f19538a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        boolean z11 = false;
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (!z10) {
            r02 = f0.f11475s;
        } else {
            qd.e eVar = m0.f11495a;
            r02 = od.p.f19534a;
            kd.d dVar = r02.f13627e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = f0.f11475s;
            }
        }
        f11480a = r02;
    }
}
