package ib;
public final class a implements c {
    public static final Object f16294c = new Object();
    public volatile b f16295a;
    public volatile Object f16296b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16296b = f16294c;
        obj.f16295a = bVar;
        return obj;
    }

    @Override
    public final Object mo23get() {
        Object obj;
        Object obj2 = this.f16296b;
        Object obj3 = f16294c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f16296b;
                if (obj == obj3) {
                    obj = this.f16295a.mo23get();
                    Object obj4 = this.f16296b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16296b = obj;
                    this.f16295a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
