package d9;
public final class w implements u {
    public static final a3.s d = new a3.s(1);
    public final Object f7906a = new Object();
    public volatile u f7907b;
    public Object f7908c;

    public w(u uVar) {
        this.f7907b = uVar;
    }

    @Override
    public final Object get() {
        u uVar = this.f7907b;
        a3.s sVar = d;
        if (uVar != sVar) {
            synchronized (this.f7906a) {
                try {
                    if (this.f7907b != sVar) {
                        Object obj = this.f7907b.get();
                        this.f7908c = obj;
                        this.f7907b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7908c;
    }

    public final String toString() {
        Object obj = this.f7907b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7908c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
