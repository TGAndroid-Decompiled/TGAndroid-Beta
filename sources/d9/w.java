package d9;
public final class w implements u {
    public static final a3.s d = new a3.s(1);
    public final Object f7904a = new Object();
    public volatile u f7905b;
    public Object f7906c;

    public w(u uVar) {
        this.f7905b = uVar;
    }

    @Override
    public final Object get() {
        u uVar = this.f7905b;
        a3.s sVar = d;
        if (uVar != sVar) {
            synchronized (this.f7904a) {
                try {
                    if (this.f7905b != sVar) {
                        Object obj = this.f7905b.get();
                        this.f7906c = obj;
                        this.f7905b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7906c;
    }

    public final String toString() {
        Object obj = this.f7905b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7906c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
