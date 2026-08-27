package id;

public abstract class h0 {

    public static final k0 f11156a;

    static {
        String property;
        ?? r10;
        int i10 = nd.v.f18508a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            pd.e eVar = n0.f11171a;
            r10 = nd.o.f18504a;
            jd.e eVar2 = r10.f12908e;
            if (!(r10 != 0)) {
                r10 = g0.f11153s;
            }
        } else {
            r10 = g0.f11153s;
        }
        f11156a = r10;
    }
}
