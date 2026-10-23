package n6;
public final class m implements k {
    public static m f17280b;
    public static final n f17281c = new n(0, 0, 0, false, false);
    public Object f17282a;

    public m(Object obj) {
        this.f17282a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f17280b == null) {
                    f17280b = new Object();
                }
                mVar = f17280b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.f17282a;
        dVar.f1069a = qVar;
        return dVar;
    }
}
