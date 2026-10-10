package n6;
public final class m implements k {
    public static m f16697b;
    public static final n f16698c = new n(0, 0, 0, false, false);
    public Object f16699a;

    public m(Object obj) {
        this.f16699a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f16697b == null) {
                    f16697b = new Object();
                }
                mVar = f16697b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16699a;
        dVar.f3314a = qVar;
        return dVar;
    }
}
