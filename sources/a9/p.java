package a9;
public final class p implements t {
    public static final Object f348c = new Object();
    public volatile t f349a;
    public volatile Object f350b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f350b = f348c;
        obj.f349a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f350b;
        Object obj3 = f348c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f350b;
                    if (obj == obj3) {
                        obj = this.f349a.a();
                        Object obj4 = this.f350b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f350b = obj;
                        this.f349a = null;
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
