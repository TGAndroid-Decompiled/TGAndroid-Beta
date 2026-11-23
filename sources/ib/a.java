package ib;
public final class a implements c {
    public static final Object f16231c = new Object();
    public volatile b f16232a;
    public volatile Object f16233b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16233b = f16231c;
        obj.f16232a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f16233b;
        Object obj3 = f16231c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f16233b;
                if (obj == obj3) {
                    obj = this.f16232a.mo24get();
                    Object obj4 = this.f16233b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16233b = obj;
                    this.f16232a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
