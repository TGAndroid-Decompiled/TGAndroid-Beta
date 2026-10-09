package n6;
public final class m implements k {
    public static m f16693b;
    public static final n f16694c = new n(0, 0, 0, false, false);
    public Object f16695a;

    public m(Object obj) {
        this.f16695a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f16693b == null) {
                    f16693b = new Object();
                }
                mVar = f16693b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16695a;
        dVar.f3314a = qVar;
        return dVar;
    }
}
