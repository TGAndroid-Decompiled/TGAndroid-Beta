package n6;
public final class m implements k {
    public static m f17212b;
    public static final n f17213c = new n(0, 0, 0, false, false);
    public Object f17214a;

    public m(Object obj) {
        this.f17214a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f17212b == null) {
                    f17212b = new Object();
                }
                mVar = f17212b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f17214a;
        dVar.f1072a = qVar;
        return dVar;
    }
}
