package n6;
public final class m implements k {
    public static m f15836b;
    public static final n f15837c = new n(0, 0, 0, false, false);
    public Object f15838a;

    public m(Object obj) {
        this.f15838a = obj;
    }

    public static synchronized m b() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15836b == null) {
                    f15836b = new Object();
                }
                mVar = f15836b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object a(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15838a;
        dVar.f2149a = qVar;
        return dVar;
    }
}
