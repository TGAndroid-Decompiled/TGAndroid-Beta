package d9;
public final class m implements q {
    public static final Object f8250c = new Object();
    public volatile q f8251a;
    public volatile Object f8252b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f8252b = f8250c;
        obj.f8251a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f8252b;
        Object obj3 = f8250c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f8252b;
                    if (obj == obj3) {
                        obj = this.f8251a.a();
                        Object obj4 = this.f8252b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f8252b = obj;
                        this.f8251a = null;
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
