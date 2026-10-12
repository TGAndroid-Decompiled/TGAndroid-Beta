package d9;
public final class w implements u {
    public static final a3.s d = new a3.s(1);
    public final Object f6447a = new Object();
    public volatile u f6448b;
    public Object f6449c;

    public w(u uVar) {
        this.f6448b = uVar;
    }

    @Override
    public final Object get() {
        u uVar = this.f6448b;
        a3.s sVar = d;
        if (uVar != sVar) {
            synchronized (this.f6447a) {
                try {
                    if (this.f6448b != sVar) {
                        Object obj = this.f6448b.get();
                        this.f6449c = obj;
                        this.f6448b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6449c;
    }

    public final String toString() {
        Object obj = this.f6448b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f6449c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
