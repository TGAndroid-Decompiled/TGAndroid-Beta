package n5;
public final class a implements gd.a {
    public static final Object f16367c = new Object();
    public volatile b f16368a;
    public volatile Object f16369b;

    public static gd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16369b = f16367c;
        obj.f16368a = bVar;
        return obj;
    }

    @Override
    public final Object mo27get() {
        Object obj;
        Object obj2 = this.f16369b;
        Object obj3 = f16367c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16369b;
                    if (obj == obj3) {
                        obj = this.f16368a.mo27get();
                        Object obj4 = this.f16369b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16369b = obj;
                        this.f16368a = null;
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
