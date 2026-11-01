package n5;
public final class a implements zc.a {
    public static final Object f13551c = new Object();
    public volatile b f13552a;
    public volatile Object f13553b;

    public static zc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f13553b = f13551c;
        obj.f13552a = bVar;
        return obj;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f13553b;
        Object obj3 = f13551c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f13553b;
                    if (obj == obj3) {
                        obj = this.f13552a.get();
                        Object obj4 = this.f13553b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f13553b = obj;
                        this.f13552a = null;
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
