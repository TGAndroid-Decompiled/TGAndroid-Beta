package n6;
public final class m implements k {
    public static m f16602b;
    public static final n f16603c = new n(0, 0, 0, false, false);
    public Object f16604a;

    public m(Object obj) {
        this.f16604a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f16602b == null) {
                    f16602b = new Object();
                }
                mVar = f16602b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object k(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16604a;
        dVar.f2068a = qVar;
        return dVar;
    }
}
