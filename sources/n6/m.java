package n6;
public final class m implements k {
    public static m f15311b;
    public static final n f15312c = new n(0, 0, 0, false, false);
    public Object f15313a;

    public m(Object obj) {
        this.f15313a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f15311b == null) {
                    f15311b = new Object();
                }
                mVar = f15311b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f15313a;
        dVar.f2999a = qVar;
        return dVar;
    }
}
