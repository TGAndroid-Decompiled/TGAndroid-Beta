package ld;
public abstract class g0 {
    public static final j0 f11999a;

    static {
        String str;
        boolean z4;
        ?? r02;
        int i10 = qd.v.f43073a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        boolean z10 = false;
        if (str != null) {
            z4 = Boolean.parseBoolean(str);
        } else {
            z4 = false;
        }
        if (!z4) {
            r02 = f0.f11994s;
        } else {
            sd.e eVar = m0.f12010a;
            r02 = qd.o.f43069a;
            md.d dVar = r02.e;
            if (r02 != 0) {
                z10 = true;
            }
            if (!z10) {
                r02 = f0.f11994s;
            }
        }
        f11999a = r02;
    }
}
