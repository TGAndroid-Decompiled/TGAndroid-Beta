package ld;
public abstract class g0 {
    public static final j0 f12316a;

    static {
        String str;
        boolean z4;
        ?? r02;
        int i10 = qd.v.f44853a;
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
            r02 = f0.f12311s;
        } else {
            sd.e eVar = m0.f12331a;
            r02 = qd.o.f44849a;
            md.d dVar = r02.f13645e;
            if (r02 != 0) {
                z10 = true;
            }
            if (!z10) {
                r02 = f0.f12311s;
            }
        }
        f12316a = r02;
    }
}
