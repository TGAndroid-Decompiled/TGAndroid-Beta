package g9;
public final class v implements t {
    public static final d3.p d = new d3.p(1);
    public final Object f13258a = new Object();
    public volatile t f13259b;
    public Object f13260c;

    public v(t tVar) {
        this.f13259b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f13259b;
        d3.p pVar = d;
        if (tVar != pVar) {
            synchronized (this.f13258a) {
                try {
                    if (this.f13259b != pVar) {
                        Object obj = this.f13259b.get();
                        this.f13260c = obj;
                        this.f13259b = pVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f13260c;
    }

    public final String toString() {
        Object obj = this.f13259b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f13260c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
