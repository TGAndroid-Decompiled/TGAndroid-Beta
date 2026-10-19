package be;
public abstract class h0 {
    public static final k0 f4292a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = ge.v.f11043a;
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
            r02 = g0.f4290s;
        } else {
            ie.e eVar = n0.f4304a;
            r02 = ge.o.f11039a;
            ce.e eVar2 = r02.e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = g0.f4290s;
            }
        }
        f4292a = r02;
    }
}
