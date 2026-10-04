package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f8171a = new Object();
    public volatile i f8172b;
    public Object f8173c;

    public k(i iVar) {
        this.f8172b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f8172b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f8171a) {
                try {
                    if (this.f8172b != sVar) {
                        Object obj = this.f8172b.get();
                        this.f8173c = obj;
                        this.f8172b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8173c;
    }

    public final String toString() {
        Object obj = this.f8172b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f8173c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
