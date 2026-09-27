package n6;
public final class m implements k {
    public static m f15330b;
    public static final n f15331c = new n(0, 0, 0, false, false);
    public Object f15332a;

    public m(Object obj) {
        this.f15332a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15330b == null) {
                    f15330b = new Object();
                }
                mVar = f15330b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15332a;
        dVar.f2994a = qVar;
        return dVar;
    }
}
