package n5;
public final class a implements fd.a {
    public static final Object f15184c = new Object();
    public volatile b f15185a;
    public volatile Object f15186b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15186b = f15184c;
        obj.f15185a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f15186b;
        Object obj3 = f15184c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f15186b;
                    if (obj == obj3) {
                        obj = this.f15185a.mo28get();
                        Object obj4 = this.f15186b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f15186b = obj;
                        this.f15185a = null;
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
