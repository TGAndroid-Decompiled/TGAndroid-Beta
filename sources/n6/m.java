package n6;
public final class m implements k {
    public static m f17219b;
    public static final n f17220c = new n(0, 0, 0, false, false);
    public Object f17221a;

    public m(Object obj) {
        this.f17221a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f17219b == null) {
                    f17219b = new Object();
                }
                mVar = f17219b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f17221a;
        dVar.f1057a = qVar;
        return dVar;
    }
}
