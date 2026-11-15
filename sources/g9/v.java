package g9;
public final class v implements t {
    public static final d3.p d = new d3.p(1);
    public final Object f12950a = new Object();
    public volatile t f12951b;
    public Object f12952c;

    public v(t tVar) {
        this.f12951b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f12951b;
        d3.p pVar = d;
        if (tVar != pVar) {
            synchronized (this.f12950a) {
                try {
                    if (this.f12951b != pVar) {
                        Object obj = this.f12951b.get();
                        this.f12952c = obj;
                        this.f12951b = pVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f12952c;
    }

    public final String toString() {
        Object obj = this.f12951b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f12952c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
