package m8;
public final class m implements q {
    public static final Object f16921c = new Object();
    public volatile q f16922a;
    public volatile Object f16923b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f16923b = f16921c;
        obj.f16922a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f16923b;
        Object obj3 = f16921c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16923b;
                    if (obj == obj3) {
                        obj = this.f16922a.a();
                        Object obj4 = this.f16923b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16923b = obj;
                        this.f16922a = null;
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
