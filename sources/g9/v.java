package g9;
public final class v implements t {
    public static final d3.p d = new d3.p(1);
    public final Object f13296a = new Object();
    public volatile t f13297b;
    public Object f13298c;

    public v(t tVar) {
        this.f13297b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f13297b;
        d3.p pVar = d;
        if (tVar != pVar) {
            synchronized (this.f13296a) {
                try {
                    if (this.f13297b != pVar) {
                        Object obj = this.f13297b.get();
                        this.f13298c = obj;
                        this.f13297b = pVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f13298c;
    }

    public final String toString() {
        Object obj = this.f13297b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f13298c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
