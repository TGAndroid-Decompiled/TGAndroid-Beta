package d9;
public final class v implements t {
    public static final a3.s d = new a3.s(1);
    public final Object f5816a = new Object();
    public volatile t f5817b;
    public Object f5818c;

    public v(t tVar) {
        this.f5817b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f5817b;
        a3.s sVar = d;
        if (tVar != sVar) {
            synchronized (this.f5816a) {
                try {
                    if (this.f5817b != sVar) {
                        Object obj = this.f5817b.get();
                        this.f5818c = obj;
                        this.f5817b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f5818c;
    }

    public final String toString() {
        Object obj = this.f5817b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f5818c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
