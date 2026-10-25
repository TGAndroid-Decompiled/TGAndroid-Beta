package o6;
public final class m implements k {
    public static m f19160b;
    public static final n f19161c = new n(0, 0, 0, false, false);
    public Object f19162a;

    public m(Object obj) {
        this.f19162a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f19160b == null) {
                    f19160b = new Object();
                }
                mVar = f19160b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object f(com.google.android.gms.common.api.q qVar) {
        n8.d dVar = (n8.d) this.f19162a;
        dVar.f3212a = qVar;
        return dVar;
    }
}
