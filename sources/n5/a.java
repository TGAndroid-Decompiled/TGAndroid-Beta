package n5;
public final class a implements fd.a {
    public static final Object f14999c = new Object();
    public volatile b f15000a;
    public volatile Object f15001b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15001b = f14999c;
        obj.f15000a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f15001b;
        Object obj3 = f14999c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f15001b;
                    if (obj == obj3) {
                        obj = this.f15000a.mo28get();
                        Object obj4 = this.f15001b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f15001b = obj;
                        this.f15000a = null;
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
