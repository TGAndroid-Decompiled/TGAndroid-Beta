package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f6345a = new Object();
    public volatile i f6346b;
    public Object f6347c;

    public k(i iVar) {
        this.f6346b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f6346b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f6345a) {
                try {
                    if (this.f6346b != sVar) {
                        Object obj = this.f6346b.get();
                        this.f6347c = obj;
                        this.f6346b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6347c;
    }

    public final String toString() {
        Object obj = this.f6346b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f6347c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
