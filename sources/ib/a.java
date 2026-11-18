package ib;
public final class a implements c {
    public static final Object f16203c = new Object();
    public volatile b f16204a;
    public volatile Object f16205b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16205b = f16203c;
        obj.f16204a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f16205b;
        Object obj3 = f16203c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f16205b;
                if (obj == obj3) {
                    obj = this.f16204a.mo24get();
                    Object obj4 = this.f16205b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16205b = obj;
                    this.f16204a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
