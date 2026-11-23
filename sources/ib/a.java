package ib;
public final class a implements c {
    public static final Object f16197c = new Object();
    public volatile b f16198a;
    public volatile Object f16199b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16199b = f16197c;
        obj.f16198a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f16199b;
        Object obj3 = f16197c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f16199b;
                if (obj == obj3) {
                    obj = this.f16198a.mo24get();
                    Object obj4 = this.f16199b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16199b = obj;
                    this.f16198a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
