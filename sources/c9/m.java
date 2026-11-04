package c9;
public final class m implements q {
    public static final Object f4276c = new Object();
    public volatile q f4277a;
    public volatile Object f4278b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f4278b = f4276c;
        obj.f4277a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f4278b;
        Object obj3 = f4276c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f4278b;
                    if (obj == obj3) {
                        obj = this.f4277a.a();
                        Object obj4 = this.f4278b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f4278b = obj;
                        this.f4277a = null;
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
