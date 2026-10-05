package n5;
public final class a implements fd.a {
    public static final Object f16654c = new Object();
    public volatile b f16655a;
    public volatile Object f16656b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16656b = f16654c;
        obj.f16655a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f16656b;
        Object obj3 = f16654c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16656b;
                    if (obj == obj3) {
                        obj = this.f16655a.mo28get();
                        Object obj4 = this.f16656b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16656b = obj;
                        this.f16655a = null;
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
