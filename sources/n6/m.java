package n6;
public final class m implements k {
    public static m f16575b;
    public static final n f16576c = new n(0, 0, 0, false, false);
    public Object f16577a;

    public m(Object obj) {
        this.f16577a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f16575b == null) {
                    f16575b = new Object();
                }
                mVar = f16575b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object k(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16577a;
        dVar.f2041a = qVar;
        return dVar;
    }
}
