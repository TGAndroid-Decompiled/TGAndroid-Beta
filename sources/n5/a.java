package n5;
public final class a implements fd.a {
    public static final Object f16501c = new Object();
    public volatile b f16502a;
    public volatile Object f16503b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16503b = f16501c;
        obj.f16502a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f16503b;
        Object obj3 = f16501c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16503b;
                    if (obj == obj3) {
                        obj = this.f16502a.mo28get();
                        Object obj4 = this.f16503b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16503b = obj;
                        this.f16502a = null;
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
