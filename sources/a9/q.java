package a9;
public final class q implements z9.b {
    public static final Object f263c = new Object();
    public volatile Object f264a = f263c;
    public volatile z9.b f265b;

    public q(z9.b bVar) {
        this.f265b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f264a;
        Object obj3 = f263c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f264a;
                    if (obj == obj3) {
                        obj = this.f265b.get();
                        this.f264a = obj;
                        this.f265b = null;
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
