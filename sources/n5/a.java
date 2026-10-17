package n5;
public final class a implements hd.a {
    public static final Object f17144c = new Object();
    public volatile b f17145a;
    public volatile Object f17146b;

    public static hd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f17146b = f17144c;
        obj.f17145a = bVar;
        return obj;
    }

    @Override
    public final Object mo27get() {
        Object obj;
        Object obj2 = this.f17146b;
        Object obj3 = f17144c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f17146b;
                    if (obj == obj3) {
                        obj = this.f17145a.mo27get();
                        Object obj4 = this.f17146b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f17146b = obj;
                        this.f17145a = null;
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
