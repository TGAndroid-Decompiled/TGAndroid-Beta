package c9;
public final class q implements ba.b {
    public static final Object f2200c = new Object();
    public volatile Object f2201a = f2200c;
    public volatile ba.b f2202b;

    public q(ba.b bVar) {
        this.f2202b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f2201a;
        Object obj3 = f2200c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f2201a;
                    if (obj == obj3) {
                        obj = this.f2202b.get();
                        this.f2201a = obj;
                        this.f2202b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return obj;
        }
        return obj2;
    }
}
