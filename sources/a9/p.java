package a9;
public final class p implements t {
    public static final Object f353c = new Object();
    public volatile t f354a;
    public volatile Object f355b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f355b = f353c;
        obj.f354a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f355b;
        Object obj3 = f353c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f355b;
                    if (obj == obj3) {
                        obj = this.f354a.a();
                        Object obj4 = this.f355b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f355b = obj;
                        this.f354a = null;
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
