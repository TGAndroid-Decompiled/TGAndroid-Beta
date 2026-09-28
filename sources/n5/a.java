package n5;
public final class a implements fd.a {
    public static final Object f15227c = new Object();
    public volatile b f15228a;
    public volatile Object f15229b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15229b = f15227c;
        obj.f15228a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f15229b;
        Object obj3 = f15227c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f15229b;
                    if (obj == obj3) {
                        obj = this.f15228a.mo28get();
                        Object obj4 = this.f15229b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f15229b = obj;
                        this.f15228a = null;
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
