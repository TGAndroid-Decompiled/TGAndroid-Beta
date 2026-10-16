package d9;
public final class w implements u {
    public static final a3.s d = new a3.s(1);
    public final Object f6450a = new Object();
    public volatile u f6451b;
    public Object f6452c;

    public w(u uVar) {
        this.f6451b = uVar;
    }

    @Override
    public final Object get() {
        u uVar = this.f6451b;
        a3.s sVar = d;
        if (uVar != sVar) {
            synchronized (this.f6450a) {
                try {
                    if (this.f6451b != sVar) {
                        Object obj = this.f6451b.get();
                        this.f6452c = obj;
                        this.f6451b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6452c;
    }

    public final String toString() {
        Object obj = this.f6451b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f6452c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
