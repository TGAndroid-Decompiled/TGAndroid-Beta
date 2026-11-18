package ib;
public final class a implements c {
    public static final Object f16206c = new Object();
    public volatile b f16207a;
    public volatile Object f16208b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16208b = f16206c;
        obj.f16207a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f16208b;
        Object obj3 = f16206c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f16208b;
                if (obj == obj3) {
                    obj = this.f16207a.mo24get();
                    Object obj4 = this.f16208b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16208b = obj;
                    this.f16207a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
