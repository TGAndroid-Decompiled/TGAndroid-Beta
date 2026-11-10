package ib;
public final class a implements c {
    public static final Object f15435c = new Object();
    public volatile b f15436a;
    public volatile Object f15437b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15437b = f15435c;
        obj.f15436a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f15437b;
        Object obj3 = f15435c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f15437b;
                if (obj == obj3) {
                    obj = this.f15436a.mo24get();
                    Object obj4 = this.f15437b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f15437b = obj;
                    this.f15436a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
