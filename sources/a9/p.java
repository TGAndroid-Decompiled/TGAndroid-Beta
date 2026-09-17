package a9;
public final class p implements s {
    public static final Object f374c = new Object();
    public volatile s f375a;
    public volatile Object f376b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f376b = f374c;
        obj.f375a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f376b;
        Object obj3 = f374c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f376b;
                    if (obj == obj3) {
                        obj = this.f375a.a();
                        Object obj4 = this.f376b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f376b = obj;
                        this.f375a = null;
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
