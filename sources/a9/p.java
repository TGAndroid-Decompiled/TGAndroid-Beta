package a9;
public final class p implements t {
    public static final Object f354c = new Object();
    public volatile t f355a;
    public volatile Object f356b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f356b = f354c;
        obj.f355a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f356b;
        Object obj3 = f354c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f356b;
                    if (obj == obj3) {
                        obj = this.f355a.a();
                        Object obj4 = this.f356b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f356b = obj;
                        this.f355a = null;
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
