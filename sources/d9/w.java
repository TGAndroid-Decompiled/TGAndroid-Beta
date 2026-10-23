package d9;
public final class w implements u {
    public static final a3.s d = new a3.s(1);
    public final Object f7915a = new Object();
    public volatile u f7916b;
    public Object f7917c;

    public w(u uVar) {
        this.f7916b = uVar;
    }

    @Override
    public final Object get() {
        u uVar = this.f7916b;
        a3.s sVar = d;
        if (uVar != sVar) {
            synchronized (this.f7915a) {
                try {
                    if (this.f7916b != sVar) {
                        Object obj = this.f7916b.get();
                        this.f7917c = obj;
                        this.f7916b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7917c;
    }

    public final String toString() {
        Object obj = this.f7916b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7917c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
