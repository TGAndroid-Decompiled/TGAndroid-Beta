package g9;
public final class w implements u {
    public static final d3.q d = new d3.q(1);
    public final Object f13605a = new Object();
    public volatile u f13606b;
    public Object f13607c;

    public w(u uVar) {
        this.f13606b = uVar;
    }

    @Override
    public final Object get() {
        u uVar = this.f13606b;
        d3.q qVar = d;
        if (uVar != qVar) {
            synchronized (this.f13605a) {
                try {
                    if (this.f13606b != qVar) {
                        Object obj = this.f13606b.get();
                        this.f13607c = obj;
                        this.f13606b = qVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f13607c;
    }

    public final String toString() {
        Object obj = this.f13606b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f13607c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
