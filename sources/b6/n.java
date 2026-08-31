package b6;
public final class n implements l {
    public static n f1760b;
    public static final o f1761c = new o(0, 0, 0, false, false);
    public Object f1762a;

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f1760b == null) {
                    f1760b = new Object();
                }
                nVar = f1760b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object f(com.google.android.gms.common.api.q qVar) {
        a8.d dVar = (a8.d) this.f1762a;
        dVar.f2406a = qVar;
        return dVar;
    }
}
