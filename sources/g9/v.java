package g9;
public final class v implements t {
    public static final d3.p d = new d3.p(1);
    public final Object f13267a = new Object();
    public volatile t f13268b;
    public Object f13269c;

    public v(t tVar) {
        this.f13268b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f13268b;
        d3.p pVar = d;
        if (tVar != pVar) {
            synchronized (this.f13267a) {
                try {
                    if (this.f13268b != pVar) {
                        Object obj = this.f13268b.get();
                        this.f13269c = obj;
                        this.f13268b = pVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f13269c;
    }

    public final String toString() {
        Object obj = this.f13268b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f13269c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
