package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f7571a = new Object();
    public volatile i f7572b;
    public Object f7573c;

    public k(i iVar) {
        this.f7572b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f7572b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f7571a) {
                try {
                    if (this.f7572b != sVar) {
                        Object obj = this.f7572b.get();
                        this.f7573c = obj;
                        this.f7572b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7573c;
    }

    public final String toString() {
        Object obj = this.f7572b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7573c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
