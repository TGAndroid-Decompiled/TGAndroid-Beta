package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f8172a = new Object();
    public volatile i f8173b;
    public Object f8174c;

    public k(i iVar) {
        this.f8173b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f8173b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f8172a) {
                try {
                    if (this.f8173b != sVar) {
                        Object obj = this.f8173b.get();
                        this.f8174c = obj;
                        this.f8173b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8174c;
    }

    public final String toString() {
        Object obj = this.f8173b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f8174c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
