package a9;
public final class p implements s {
    public static final Object f362c = new Object();
    public volatile s f363a;
    public volatile Object f364b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f364b = f362c;
        obj.f363a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f364b;
        Object obj3 = f362c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f364b;
                    if (obj == obj3) {
                        obj = this.f363a.a();
                        Object obj4 = this.f364b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f364b = obj;
                        this.f363a = null;
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
