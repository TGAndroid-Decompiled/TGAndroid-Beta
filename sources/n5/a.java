package n5;
public final class a implements fd.a {
    public static final Object f15235c = new Object();
    public volatile b f15236a;
    public volatile Object f15237b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15237b = f15235c;
        obj.f15236a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f15237b;
        Object obj3 = f15235c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f15237b;
                    if (obj == obj3) {
                        obj = this.f15236a.mo28get();
                        Object obj4 = this.f15237b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f15237b = obj;
                        this.f15236a = null;
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
