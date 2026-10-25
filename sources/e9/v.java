package e9;
public final class v implements t {
    public static final a3.s d = new a3.s(1);
    public final Object f9856a = new Object();
    public volatile t f9857b;
    public Object f9858c;

    public v(t tVar) {
        this.f9857b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f9857b;
        a3.s sVar = d;
        if (tVar != sVar) {
            synchronized (this.f9856a) {
                try {
                    if (this.f9857b != sVar) {
                        Object obj = this.f9857b.get();
                        this.f9858c = obj;
                        this.f9857b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f9858c;
    }

    public final String toString() {
        Object obj = this.f9857b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f9858c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
