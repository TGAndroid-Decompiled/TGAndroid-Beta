package n5;
public final class a implements zc.a {
    public static final Object f13550c = new Object();
    public volatile b f13551a;
    public volatile Object f13552b;

    public static zc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f13552b = f13550c;
        obj.f13551a = bVar;
        return obj;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f13552b;
        Object obj3 = f13550c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f13552b;
                    if (obj == obj3) {
                        obj = this.f13551a.get();
                        Object obj4 = this.f13552b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f13552b = obj;
                        this.f13551a = null;
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
