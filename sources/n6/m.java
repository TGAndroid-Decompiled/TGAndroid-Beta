package n6;
public final class m implements k {
    public static m f15295b;
    public static final n f15296c = new n(0, 0, 0, false, false);
    public Object f15297a;

    public m(Object obj) {
        this.f15297a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15295b == null) {
                    f15295b = new Object();
                }
                mVar = f15295b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15297a;
        dVar.f2992a = qVar;
        return dVar;
    }
}
