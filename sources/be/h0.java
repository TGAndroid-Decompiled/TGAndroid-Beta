package be;
public abstract class h0 {
    public static final k0 f2677a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = ge.v.f10134a;
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
            r02 = g0.f2675s;
        } else {
            ie.e eVar = n0.f2689a;
            r02 = ge.o.f10130a;
            ce.e eVar2 = r02.e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = g0.f2675s;
            }
        }
        f2677a = r02;
    }
}
