package ae;
public abstract class i0 {
    public static final l0 f467a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = fe.v.f9915a;
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
            r02 = h0.f464s;
        } else {
            he.e eVar = o0.f482a;
            r02 = fe.o.f9911a;
            be.e eVar2 = r02.f3880e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = h0.f464s;
            }
        }
        f467a = r02;
    }
}
