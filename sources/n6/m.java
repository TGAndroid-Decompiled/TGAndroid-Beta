package n6;
public final class m implements k {
    public static m f15077b;
    public static final n f15078c = new n(0, 0, 0, false, false);
    public Object f15079a;

    public m(Object obj) {
        this.f15079a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15077b == null) {
                    f15077b = new Object();
                }
                mVar = f15077b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15079a;
        dVar.f3000a = qVar;
        return dVar;
    }
}
