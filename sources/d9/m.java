package d9;
public final class m implements q {
    public static final Object f7919c = new Object();
    public volatile q f7920a;
    public volatile Object f7921b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f7921b = f7919c;
        obj.f7920a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f7921b;
        Object obj3 = f7919c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f7921b;
                    if (obj == obj3) {
                        obj = this.f7920a.a();
                        Object obj4 = this.f7921b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f7921b = obj;
                        this.f7920a = null;
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
