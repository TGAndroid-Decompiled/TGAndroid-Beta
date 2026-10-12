package a9;
public final class p implements t {
    public static final Object f350c = new Object();
    public volatile t f351a;
    public volatile Object f352b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f352b = f350c;
        obj.f351a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f352b;
        Object obj3 = f350c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f352b;
                    if (obj == obj3) {
                        obj = this.f351a.a();
                        Object obj4 = this.f352b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f352b = obj;
                        this.f351a = null;
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
