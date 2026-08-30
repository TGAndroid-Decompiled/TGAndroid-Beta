package c9;
public final class p implements ba.b {
    public static final Object f2176c = new Object();
    public volatile Object f2177a = f2176c;
    public volatile ba.b f2178b;

    public p(ba.b bVar) {
        this.f2178b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f2177a;
        Object obj3 = f2176c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f2177a;
                    if (obj == obj3) {
                        obj = this.f2178b.get();
                        this.f2177a = obj;
                        this.f2178b = null;
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
