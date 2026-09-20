package n6;
public final class m implements k {
    public static m f15290b;
    public static final n f15291c = new n(0, 0, 0, false, false);
    public Object f15292a;

    public m(Object obj) {
        this.f15292a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15290b == null) {
                    f15290b = new Object();
                }
                mVar = f15290b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15292a;
        dVar.f3000a = qVar;
        return dVar;
    }
}
