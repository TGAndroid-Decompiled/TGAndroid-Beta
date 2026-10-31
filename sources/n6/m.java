package n6;
public final class m implements k {
    public static m f13618b;
    public static final n f13619c = new n(0, 0, 0, false, false);
    public Object f13620a;

    public m(Object obj) {
        this.f13620a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f13618b == null) {
                    f13618b = new Object();
                }
                mVar = f13618b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object e(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f13620a;
        dVar.f2047a = qVar;
        return dVar;
    }
}
