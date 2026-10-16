package n5;
public final class a implements hd.a {
    public static final Object f15768c = new Object();
    public volatile b f15769a;
    public volatile Object f15770b;

    public static hd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f15770b = f15768c;
        obj.f15769a = bVar;
        return obj;
    }

    @Override
    public final Object mo27get() {
        Object obj;
        Object obj2 = this.f15770b;
        Object obj3 = f15768c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f15770b;
                    if (obj == obj3) {
                        obj = this.f15769a.mo27get();
                        Object obj4 = this.f15770b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f15770b = obj;
                        this.f15769a = null;
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
