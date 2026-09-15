package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f7569a = new Object();
    public volatile i f7570b;
    public Object f7571c;

    public k(i iVar) {
        this.f7570b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f7570b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f7569a) {
                try {
                    if (this.f7570b != sVar) {
                        Object obj = this.f7570b.get();
                        this.f7571c = obj;
                        this.f7570b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7571c;
    }

    public final String toString() {
        Object obj = this.f7570b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7571c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
