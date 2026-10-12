package n6;
public final class m implements k {
    public static m f16124b;
    public static final n f16125c = new n(0, 0, 0, false, false);
    public Object f16126a;

    public m(Object obj) {
        this.f16126a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f16124b == null) {
                    f16124b = new Object();
                }
                mVar = f16124b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16126a;
        dVar.f2145a = qVar;
        return dVar;
    }
}
