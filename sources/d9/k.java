package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f7574a = new Object();
    public volatile i f7575b;
    public Object f7576c;

    public k(i iVar) {
        this.f7575b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f7575b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f7574a) {
                try {
                    if (this.f7575b != sVar) {
                        Object obj = this.f7575b.get();
                        this.f7576c = obj;
                        this.f7575b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7576c;
    }

    public final String toString() {
        Object obj = this.f7575b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7576c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
