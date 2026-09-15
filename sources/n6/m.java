package n6;
public final class m implements k {
    public static m f15067b;
    public static final n f15068c = new n(0, 0, 0, false, false);
    public Object f15069a;

    public m(Object obj) {
        this.f15069a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15067b == null) {
                    f15067b = new Object();
                }
                mVar = f15067b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15069a;
        dVar.f2995a = qVar;
        return dVar;
    }
}
