package f9;
public final class v implements t {
    public static final c3.q d = new c3.q(1);
    public final Object f11524a = new Object();
    public volatile t f11525b;
    public Object f11526c;

    public v(t tVar) {
        this.f11525b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f11525b;
        c3.q qVar = d;
        if (tVar != qVar) {
            synchronized (this.f11524a) {
                try {
                    if (this.f11525b != qVar) {
                        Object obj = this.f11525b.get();
                        this.f11526c = obj;
                        this.f11525b = qVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f11526c;
    }

    public final String toString() {
        Object obj = this.f11525b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f11526c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
