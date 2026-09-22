package n6;
public final class m implements k {
    public static m f15065b;
    public static final n f15066c = new n(0, 0, 0, false, false);
    public Object f15067a;

    public m(Object obj) {
        this.f15067a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15065b == null) {
                    f15065b = new Object();
                }
                mVar = f15065b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15067a;
        dVar.f2997a = qVar;
        return dVar;
    }
}
