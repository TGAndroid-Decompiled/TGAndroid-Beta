package a9;
public final class p implements t {
    public static final Object f376c = new Object();
    public volatile t f377a;
    public volatile Object f378b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f378b = f376c;
        obj.f377a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f378b;
        Object obj3 = f376c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f378b;
                    if (obj == obj3) {
                        obj = this.f377a.a();
                        Object obj4 = this.f378b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f378b = obj;
                        this.f377a = null;
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
