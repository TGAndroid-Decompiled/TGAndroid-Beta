package o8;
public final class m implements p {
    public static final Object f16655c = new Object();
    public volatile p f16656a;
    public volatile Object f16657b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        ?? obj = new Object();
        obj.f16657b = f16655c;
        obj.f16656a = nVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.f16657b;
        Object obj3 = f16655c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16657b;
                    if (obj == obj3) {
                        obj = this.f16656a.a();
                        Object obj4 = this.f16657b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16657b = obj;
                        this.f16656a = null;
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
