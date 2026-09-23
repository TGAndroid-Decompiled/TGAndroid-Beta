package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f7557a = new Object();
    public volatile i f7558b;
    public Object f7559c;

    public k(i iVar) {
        this.f7558b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f7558b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f7557a) {
                try {
                    if (this.f7558b != sVar) {
                        Object obj = this.f7558b.get();
                        this.f7559c = obj;
                        this.f7558b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7559c;
    }

    public final String toString() {
        Object obj = this.f7558b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7559c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
