package o5;
public final class a implements id.a {
    public static final Object f19091c = new Object();
    public volatile b f19092a;
    public volatile Object f19093b;

    public static id.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f19093b = f19091c;
        obj.f19092a = bVar;
        return obj;
    }

    @Override
    public final Object mo27get() {
        Object obj;
        Object obj2 = this.f19093b;
        Object obj3 = f19091c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f19093b;
                    if (obj == obj3) {
                        obj = this.f19092a.mo27get();
                        Object obj4 = this.f19093b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f19093b = obj;
                        this.f19092a = null;
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
