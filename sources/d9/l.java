package d9;

import a3.r;
public final class l implements j {
    public static final r d = new r(1);
    public final Object f6643a = new Object();
    public volatile j f6644b;
    public Object f6645c;

    public l(j jVar) {
        this.f6644b = jVar;
    }

    @Override
    public final Object get() {
        j jVar = this.f6644b;
        r rVar = d;
        if (jVar != rVar) {
            synchronized (this.f6643a) {
                try {
                    if (this.f6644b != rVar) {
                        Object obj = this.f6644b.get();
                        this.f6645c = obj;
                        this.f6644b = rVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6645c;
    }

    public final String toString() {
        Object obj = this.f6644b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f6645c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
