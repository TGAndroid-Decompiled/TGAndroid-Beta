package ae;
public abstract class i0 {
    public static final l0 f465a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = fe.v.f9916a;
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
            r02 = h0.f462s;
        } else {
            he.e eVar = o0.f480a;
            r02 = fe.o.f9912a;
            be.e eVar2 = r02.f3881e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = h0.f462s;
            }
        }
        f465a = r02;
    }
}
