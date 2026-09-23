package n6;
public final class m implements k {
    public static m f15042b;
    public static final n f15043c = new n(0, 0, 0, false, false);
    public Object f15044a;

    public m(Object obj) {
        this.f15044a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15042b == null) {
                    f15042b = new Object();
                }
                mVar = f15042b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15044a;
        dVar.f2992a = qVar;
        return dVar;
    }
}
