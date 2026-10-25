package ce;
public abstract class h0 {
    public static final k0 f6233a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i10 = he.w.f12822a;
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
            r02 = g0.f6231s;
        } else {
            je.e eVar = n0.f6245a;
            r02 = he.o.f12816a;
            de.e eVar2 = r02.e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = g0.f6231s;
            }
        }
        f6233a = r02;
    }
}
