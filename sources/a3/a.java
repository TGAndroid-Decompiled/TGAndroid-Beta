package a3;
public final class a implements rc.a {
    public static final Object f42c = new Object();
    public volatile b f43a;
    public volatile Object f44b;

    public static rc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f44b = f42c;
        obj.f43a = bVar;
        return obj;
    }

    @Override
    public final Object mo0get() {
        Object obj;
        Object obj2 = this.f44b;
        Object obj3 = f42c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44b;
                    if (obj == obj3) {
                        obj = this.f43a.mo0get();
                        Object obj4 = this.f44b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f44b = obj;
                        this.f43a = null;
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
