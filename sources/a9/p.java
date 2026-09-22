package a9;
public final class p implements t {
    public static final Object f347c = new Object();
    public volatile t f348a;
    public volatile Object f349b;

    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        ?? obj = new Object();
        obj.f349b = f347c;
        obj.f348a = qVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f349b;
        Object obj3 = f347c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f349b;
                    if (obj == obj3) {
                        obj = this.f348a.a();
                        Object obj4 = this.f349b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f349b = obj;
                        this.f348a = null;
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
