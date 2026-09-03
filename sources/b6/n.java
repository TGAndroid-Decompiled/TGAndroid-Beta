package b6;
public final class n implements l {
    public static n f1638b;
    public static final o f1639c = new o(0, 0, 0, false, false);
    public Object f1640a;

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f1638b == null) {
                    f1638b = new Object();
                }
                nVar = f1638b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object J(com.google.android.gms.common.api.q qVar) {
        a8.d dVar = (a8.d) this.f1640a;
        dVar.f2238a = qVar;
        return dVar;
    }
}
