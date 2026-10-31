package a9;
public final class p implements t {
    public static final Object f352c = new Object();
    public volatile t f353a;
    public volatile Object f354b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f354b = f352c;
        obj.f353a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f354b;
        Object obj3 = f352c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f354b;
                    if (obj == obj3) {
                        obj = this.f353a.a();
                        Object obj4 = this.f354b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f354b = obj;
                        this.f353a = null;
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
