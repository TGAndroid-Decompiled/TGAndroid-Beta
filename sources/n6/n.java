package n6;
public final class n implements l {
    public static n f16742b;
    public static final o f16743c = new o(0, 0, 0, false, false);
    public Object f16744a;

    public n(Object obj) {
        this.f16744a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f16742b == null) {
                    f16742b = new Object();
                }
                nVar = f16742b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16744a;
        dVar.f3314a = qVar;
        return dVar;
    }
}
