package l8;

public final class m implements p {

    public static final Object f15481c = new Object();

    public volatile p f15482a;

    public volatile Object f15483b;

    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        m mVar = new m();
        mVar.f15483b = f15481c;
        mVar.f15482a = nVar;
        return mVar;
    }

    @Override
    public final Object a() {
        Object objA;
        Object obj = this.f15483b;
        Object obj2 = f15481c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f15483b;
                if (objA == obj2) {
                    objA = this.f15482a.a();
                    Object obj3 = this.f15483b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f15483b = objA;
                    this.f15482a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
