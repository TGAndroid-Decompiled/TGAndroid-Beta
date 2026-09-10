package a9;
public final class p implements t {
    public static final Object f346c = new Object();
    public volatile t f347a;
    public volatile Object f348b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f348b = f346c;
        obj.f347a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f348b;
        Object obj3 = f346c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f348b;
                    if (obj == obj3) {
                        obj = this.f347a.a();
                        Object obj4 = this.f348b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f348b = obj;
                        this.f347a = null;
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
