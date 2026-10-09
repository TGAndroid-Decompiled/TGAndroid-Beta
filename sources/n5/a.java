package n5;
public final class a implements gd.a {
    public static final Object f16618c = new Object();
    public volatile b f16619a;
    public volatile Object f16620b;

    public static gd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16620b = f16618c;
        obj.f16619a = bVar;
        return obj;
    }

    @Override
    public final Object mo27get() {
        Object obj;
        Object obj2 = this.f16620b;
        Object obj3 = f16618c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16620b;
                    if (obj == obj3) {
                        obj = this.f16619a.mo27get();
                        Object obj4 = this.f16620b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16620b = obj;
                        this.f16619a = null;
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
