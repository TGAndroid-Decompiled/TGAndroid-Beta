package o8;
public final class m implements p {
    public static final Object f16494c = new Object();
    public volatile p f16495a;
    public volatile Object f16496b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f16496b = f16494c;
        obj.f16495a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f16496b;
        Object obj3 = f16494c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16496b;
                    if (obj == obj3) {
                        obj = this.f16495a.a();
                        Object obj4 = this.f16496b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16496b = obj;
                        this.f16495a = null;
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
