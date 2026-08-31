package c9;
public final class p implements ba.b {
    public static final Object f2366c = new Object();
    public volatile Object f2367a = f2366c;
    public volatile ba.b f2368b;

    public p(ba.b bVar) {
        this.f2368b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f2367a;
        Object obj3 = f2366c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f2367a;
                    if (obj == obj3) {
                        obj = this.f2368b.get();
                        this.f2367a = obj;
                        this.f2368b = null;
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
