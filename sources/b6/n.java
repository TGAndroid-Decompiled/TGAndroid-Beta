package b6;
public final class n implements l {
    public static n f1627b;
    public static final o f1628c = new o(0, 0, 0, false, false);
    public Object f1629a;

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f1627b == null) {
                    f1627b = new Object();
                }
                nVar = f1627b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object f(com.google.android.gms.common.api.q qVar) {
        a8.d dVar = (a8.d) this.f1629a;
        dVar.f2215a = qVar;
        return dVar;
    }
}
