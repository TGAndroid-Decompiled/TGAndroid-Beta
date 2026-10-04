package n6;
public final class m implements k {
    public static m f16723b;
    public static final n f16724c = new n(0, 0, 0, false, false);
    public Object f16725a;

    public m(Object obj) {
        this.f16725a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f16723b == null) {
                    f16723b = new Object();
                }
                mVar = f16723b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object i(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f16725a;
        dVar.f3235a = qVar;
        return dVar;
    }
}
