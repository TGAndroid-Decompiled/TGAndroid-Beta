package d9;
public final class m implements q {
    public static final Object f8253c = new Object();
    public volatile q f8254a;
    public volatile Object f8255b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f8255b = f8253c;
        obj.f8254a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f8255b;
        Object obj3 = f8253c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f8255b;
                    if (obj == obj3) {
                        obj = this.f8254a.a();
                        Object obj4 = this.f8255b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f8255b = obj;
                        this.f8254a = null;
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
