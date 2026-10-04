package n6;
public final class m implements k {
    public static m f16718b;
    public static final n f16719c = new n(0, 0, 0, false, false);
    public Object f16720a;

    public m(Object obj) {
        this.f16720a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f16718b == null) {
                    f16718b = new Object();
                }
                mVar = f16718b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object i(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16720a;
        dVar.f3235a = qVar;
        return dVar;
    }
}
