package b9;
public final class n implements r {
    public static final Object f3711c = new Object();
    public volatile r f3712a;
    public volatile Object f3713b;

    public static n b(o oVar) {
        if (oVar instanceof n) {
            return (n) oVar;
        }
        ?? obj = new Object();
        obj.f3713b = f3711c;
        obj.f3712a = oVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f3713b;
        Object obj3 = f3711c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f3713b;
                    if (obj == obj3) {
                        obj = this.f3712a.a();
                        Object obj4 = this.f3713b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f3713b = obj;
                        this.f3712a = null;
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
