package n5;
public final class a implements hd.a {
    public static final Object f16054c = new Object();
    public volatile b f16055a;
    public volatile Object f16056b;

    public static hd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16056b = f16054c;
        obj.f16055a = bVar;
        return obj;
    }

    @Override
    public final Object mo27get() {
        Object obj;
        Object obj2 = this.f16056b;
        Object obj3 = f16054c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16056b;
                    if (obj == obj3) {
                        obj = this.f16055a.mo27get();
                        Object obj4 = this.f16056b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16056b = obj;
                        this.f16055a = null;
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
