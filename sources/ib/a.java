package ib;
public final class a implements c {
    public static final Object f16228c = new Object();
    public volatile b f16229a;
    public volatile Object f16230b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16230b = f16228c;
        obj.f16229a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f16230b;
        Object obj3 = f16228c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f16230b;
                if (obj == obj3) {
                    obj = this.f16229a.mo24get();
                    Object obj4 = this.f16230b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16230b = obj;
                    this.f16229a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
