package d9;

import a3.s;
public final class k implements i {
    public static final s d = new s(1);
    public final Object f7568a = new Object();
    public volatile i f7569b;
    public Object f7570c;

    public k(i iVar) {
        this.f7569b = iVar;
    }

    @Override
    public final Object get() {
        i iVar = this.f7569b;
        s sVar = d;
        if (iVar != sVar) {
            synchronized (this.f7568a) {
                try {
                    if (this.f7569b != sVar) {
                        Object obj = this.f7569b.get();
                        this.f7570c = obj;
                        this.f7569b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7570c;
    }

    public final String toString() {
        Object obj = this.f7569b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7570c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
