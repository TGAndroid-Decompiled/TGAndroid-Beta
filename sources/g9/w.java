package g9;
public final class w implements u {
    public static final d3.q d = new d3.q(1);
    public final Object f13603a = new Object();
    public volatile u f13604b;
    public Object f13605c;

    public w(u uVar) {
        this.f13604b = uVar;
    }

    @Override
    public final Object get() {
        u uVar = this.f13604b;
        d3.q qVar = d;
        if (uVar != qVar) {
            synchronized (this.f13603a) {
                try {
                    if (this.f13604b != qVar) {
                        Object obj = this.f13604b.get();
                        this.f13605c = obj;
                        this.f13604b = qVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f13605c;
    }

    public final String toString() {
        Object obj = this.f13604b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f13605c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
