package ib;
public final class a implements c {
    public static final Object f15430c = new Object();
    public volatile b f15431a;
    public volatile Object f15432b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15432b = f15430c;
        obj.f15431a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f15432b;
        Object obj3 = f15430c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f15432b;
                if (obj == obj3) {
                    obj = this.f15431a.mo24get();
                    Object obj4 = this.f15432b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f15432b = obj;
                    this.f15431a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
