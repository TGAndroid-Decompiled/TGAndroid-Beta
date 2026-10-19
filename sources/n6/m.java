package n6;
public final class m implements k {
    public static m f17217b;
    public static final n f17218c = new n(0, 0, 0, false, false);
    public Object f17219a;

    public m(Object obj) {
        this.f17219a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f17217b == null) {
                    f17217b = new Object();
                }
                mVar = f17217b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f17219a;
        dVar.f1067a = qVar;
        return dVar;
    }
}
