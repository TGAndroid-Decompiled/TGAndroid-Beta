package n6;
public final class m implements k {
    public static m f13619b;
    public static final n f13620c = new n(0, 0, 0, false, false);
    public Object f13621a;

    public m(Object obj) {
        this.f13621a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f13619b == null) {
                    f13619b = new Object();
                }
                mVar = f13619b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object e(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f13621a;
        dVar.f2047a = qVar;
        return dVar;
    }
}
