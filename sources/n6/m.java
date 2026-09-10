package n6;
public final class m implements k {
    public static m f13897b;
    public static final n f13898c = new n(0, 0, 0, false, false);
    public Object f13899a;

    public m(Object obj) {
        this.f13899a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f13897b == null) {
                    f13897b = new Object();
                }
                mVar = f13897b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f13899a;
        dVar.f1693a = qVar;
        return dVar;
    }
}
