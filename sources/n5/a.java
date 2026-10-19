package n5;
public final class a implements hd.a {
    public static final Object f17148c = new Object();
    public volatile b f17149a;
    public volatile Object f17150b;

    public static hd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f17150b = f17148c;
        obj.f17149a = bVar;
        return obj;
    }

    @Override
    public final Object mo27get() {
        Object obj;
        Object obj2 = this.f17150b;
        Object obj3 = f17148c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f17150b;
                    if (obj == obj3) {
                        obj = this.f17149a.mo27get();
                        Object obj4 = this.f17150b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f17150b = obj;
                        this.f17149a = null;
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
