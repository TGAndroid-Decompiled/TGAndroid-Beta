package g9;
public final class v implements t {
    public static final d3.p d = new d3.p(1);
    public final Object f13293a = new Object();
    public volatile t f13294b;
    public Object f13295c;

    public v(t tVar) {
        this.f13294b = tVar;
    }

    @Override
    public final Object get() {
        t tVar = this.f13294b;
        d3.p pVar = d;
        if (tVar != pVar) {
            synchronized (this.f13293a) {
                try {
                    if (this.f13294b != pVar) {
                        Object obj = this.f13294b.get();
                        this.f13295c = obj;
                        this.f13294b = pVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f13295c;
    }

    public final String toString() {
        Object obj = this.f13294b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f13295c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
