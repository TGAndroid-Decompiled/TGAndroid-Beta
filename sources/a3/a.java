package a3;
public final class a implements rc.a {
    public static final Object f46c = new Object();
    public volatile b f47a;
    public volatile Object f48b;

    public static rc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f48b = f46c;
        obj.f47a = bVar;
        return obj;
    }

    @Override
    public final Object mo38get() {
        Object obj;
        Object obj2 = this.f48b;
        Object obj3 = f46c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f48b;
                    if (obj == obj3) {
                        obj = this.f47a.mo38get();
                        Object obj4 = this.f48b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f48b = obj;
                        this.f47a = null;
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
