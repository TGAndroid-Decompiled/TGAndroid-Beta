package e9;
public final class v implements t {
    public static final a3.s d = new a3.s(1);
    public final Object f9855a = new Object();
    public volatile t f9856b;
    public Object f9857c;

    public v(t tVar) {
        this.f9856b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f9856b;
        a3.s sVar = d;
        if (tVar != sVar) {
            synchronized (this.f9855a) {
                try {
                    if (this.f9856b != sVar) {
                        Object obj = this.f9856b.get();
                        this.f9857c = obj;
                        this.f9856b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f9857c;
    }

    public final String toString() {
        Object obj = this.f9856b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f9857c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
