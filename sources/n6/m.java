package n6;
public final class m implements k {
    public static m f15252b;
    public static final n f15253c = new n(0, 0, 0, false, false);
    public Object f15254a;

    public m(Object obj) {
        this.f15254a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15252b == null) {
                    f15252b = new Object();
                }
                mVar = f15252b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15254a;
        dVar.f3000a = qVar;
        return dVar;
    }
}
