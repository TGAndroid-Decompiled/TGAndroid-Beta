package ib;
public final class a implements c {
    public static final Object f15433c = new Object();
    public volatile b f15434a;
    public volatile Object f15435b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15435b = f15433c;
        obj.f15434a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f15435b;
        Object obj3 = f15433c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f15435b;
                if (obj == obj3) {
                    obj = this.f15434a.mo24get();
                    Object obj4 = this.f15435b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f15435b = obj;
                    this.f15434a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
