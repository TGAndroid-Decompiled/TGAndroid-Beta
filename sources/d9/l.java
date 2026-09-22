package d9;

import a3.s;
public final class l implements j {
    public static final s d = new s(1);
    public final Object f7573a = new Object();
    public volatile j f7574b;
    public Object f7575c;

    public l(j jVar) {
        this.f7574b = jVar;
    }

    @Override
    public final Object get() {
        j jVar = this.f7574b;
        s sVar = d;
        if (jVar != sVar) {
            synchronized (this.f7573a) {
                try {
                    if (this.f7574b != sVar) {
                        Object obj = this.f7574b.get();
                        this.f7575c = obj;
                        this.f7574b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f7575c;
    }

    public final String toString() {
        Object obj = this.f7574b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f7575c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
