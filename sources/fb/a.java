package fb;
public final class a implements c {
    public static final Object f11544c = new Object();
    public volatile b f11545a;
    public volatile Object f11546b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f11546b = f11544c;
        obj.f11545a = bVar;
        return obj;
    }

    @Override
    public final Object mo5get() {
        Object obj;
        Object obj2 = this.f11546b;
        Object obj3 = f11544c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f11546b;
                if (obj == obj3) {
                    obj = this.f11545a.mo5get();
                    Object obj4 = this.f11546b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f11546b = obj;
                    this.f11545a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
