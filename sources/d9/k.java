package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f7556a = new Object();
    public volatile i f7557b;
    public Object f7558c;

    public k(i iVar) {
        this.f7557b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f7557b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f7556a) {
                try {
                    if (this.f7557b != sVar) {
                        Object obj = this.f7557b.get();
                        this.f7558c = obj;
                        this.f7557b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7558c;
    }

    public final String toString() {
        Object obj = this.f7557b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7558c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
