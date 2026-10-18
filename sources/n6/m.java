package n6;
public final class m implements k {
    public static m f17215b;
    public static final n f17216c = new n(0, 0, 0, false, false);
    public Object f17217a;

    public m(Object obj) {
        this.f17217a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f17215b == null) {
                    f17215b = new Object();
                }
                mVar = f17215b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f17217a;
        dVar.f1058a = qVar;
        return dVar;
    }
}
