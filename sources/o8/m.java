package o8;
public final class m implements p {
    public static final Object f16657c = new Object();
    public volatile p f16658a;
    public volatile Object f16659b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f16659b = f16657c;
        obj.f16658a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f16659b;
        Object obj3 = f16657c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16659b;
                    if (obj == obj3) {
                        obj = this.f16658a.a();
                        Object obj4 = this.f16659b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16659b = obj;
                        this.f16658a = null;
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
