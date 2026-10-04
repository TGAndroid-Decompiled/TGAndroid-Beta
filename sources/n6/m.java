package n6;
public final class m implements k {
    public static m f16719b;
    public static final n f16720c = new n(0, 0, 0, false, false);
    public Object f16721a;

    public m(Object obj) {
        this.f16721a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f16719b == null) {
                    f16719b = new Object();
                }
                mVar = f16719b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object i(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16721a;
        dVar.f3235a = qVar;
        return dVar;
    }
}
