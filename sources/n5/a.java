package n5;
public final class a implements fd.a {
    public static final Object f14997c = new Object();
    public volatile b f14998a;
    public volatile Object f14999b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f14999b = f14997c;
        obj.f14998a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f14999b;
        Object obj3 = f14997c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f14999b;
                    if (obj == obj3) {
                        obj = this.f14998a.mo28get();
                        Object obj4 = this.f14999b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f14999b = obj;
                        this.f14998a = null;
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
