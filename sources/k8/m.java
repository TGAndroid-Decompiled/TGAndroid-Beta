package k8;
public final class m implements q {
    public static final Object f14700c = new Object();
    public volatile q f14701a;
    public volatile Object f14702b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f14702b = f14700c;
        obj.f14701a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f14702b;
        Object obj3 = f14700c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f14702b;
                    if (obj == obj3) {
                        obj = this.f14701a.a();
                        Object obj4 = this.f14702b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f14702b = obj;
                        this.f14701a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
