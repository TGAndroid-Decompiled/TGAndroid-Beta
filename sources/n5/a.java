package n5;
public final class a implements fd.a {
    public static final Object f16644c = new Object();
    public volatile b f16645a;
    public volatile Object f16646b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16646b = f16644c;
        obj.f16645a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f16646b;
        Object obj3 = f16644c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16646b;
                    if (obj == obj3) {
                        obj = this.f16645a.mo28get();
                        Object obj4 = this.f16646b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16646b = obj;
                        this.f16645a = null;
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
