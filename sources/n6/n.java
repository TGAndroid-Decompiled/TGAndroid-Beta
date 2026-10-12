package n6;
public final class n implements l {
    public static n f16445b;
    public static final o f16446c = new o(0, 0, 0, false, false);
    public Object f16447a;

    public n(Object obj) {
        this.f16447a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f16445b == null) {
                    f16445b = new Object();
                }
                nVar = f16445b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16447a;
        dVar.f3312a = qVar;
        return dVar;
    }
}
