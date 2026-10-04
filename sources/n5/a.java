package n5;
public final class a implements fd.a {
    public static final Object f16645c = new Object();
    public volatile b f16646a;
    public volatile Object f16647b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16647b = f16645c;
        obj.f16646a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f16647b;
        Object obj3 = f16645c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16647b;
                    if (obj == obj3) {
                        obj = this.f16646a.mo28get();
                        Object obj4 = this.f16647b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16647b = obj;
                        this.f16646a = null;
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
