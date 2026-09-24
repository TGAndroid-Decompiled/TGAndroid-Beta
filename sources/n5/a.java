package n5;
public final class a implements fd.a {
    public static final Object f15212c = new Object();
    public volatile b f15213a;
    public volatile Object f15214b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15214b = f15212c;
        obj.f15213a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f15214b;
        Object obj3 = f15212c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f15214b;
                    if (obj == obj3) {
                        obj = this.f15213a.mo28get();
                        Object obj4 = this.f15214b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f15214b = obj;
                        this.f15213a = null;
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
