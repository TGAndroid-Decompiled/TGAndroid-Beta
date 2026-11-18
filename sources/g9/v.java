package g9;
public final class v implements t {
    public static final d3.p d = new d3.p(1);
    public final Object f13264a = new Object();
    public volatile t f13265b;
    public Object f13266c;

    public v(t tVar) {
        this.f13265b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f13265b;
        d3.p pVar = d;
        if (tVar != pVar) {
            synchronized (this.f13264a) {
                try {
                    if (this.f13265b != pVar) {
                        Object obj = this.f13265b.get();
                        this.f13266c = obj;
                        this.f13265b = pVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f13266c;
    }

    public final String toString() {
        Object obj = this.f13265b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f13266c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
