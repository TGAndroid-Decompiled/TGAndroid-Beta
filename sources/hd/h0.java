package hd;
public abstract class h0 {
    public static final k0 f10447a;

    static {
        String str;
        boolean z10;
        ?? r02;
        int i9 = md.v.f17672a;
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
            r02 = g0.f10444s;
        } else {
            od.e eVar = n0.f10462a;
            r02 = md.o.f17668a;
            id.e eVar2 = r02.f11106e;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = g0.f10444s;
            }
        }
        f10447a = r02;
    }
}
