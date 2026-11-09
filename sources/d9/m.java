package d9;
public final class m implements q {
    public static final Object f8248c = new Object();
    public volatile q f8249a;
    public volatile Object f8250b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f8250b = f8248c;
        obj.f8249a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f8250b;
        Object obj3 = f8248c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f8250b;
                    if (obj == obj3) {
                        obj = this.f8249a.a();
                        Object obj4 = this.f8250b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f8250b = obj;
                        this.f8249a = null;
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
