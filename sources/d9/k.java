package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f7558a = new Object();
    public volatile i f7559b;
    public Object f7560c;

    public k(i iVar) {
        this.f7559b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f7559b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f7558a) {
                try {
                    if (this.f7559b != sVar) {
                        Object obj = this.f7559b.get();
                        this.f7560c = obj;
                        this.f7559b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7560c;
    }

    public final String toString() {
        Object obj = this.f7559b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7560c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
