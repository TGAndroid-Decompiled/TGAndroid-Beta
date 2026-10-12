package d9;

import a3.s;
public final class l implements j {
    public static final s d = new s(1);
    public final Object f8219a = new Object();
    public volatile j f8220b;
    public Object f8221c;

    public l(j jVar) {
        this.f8220b = jVar;
    }

    @Override
    public final Object get() {
        j jVar = this.f8220b;
        s sVar = d;
        if (jVar != sVar) {
            synchronized (this.f8219a) {
                try {
                    if (this.f8220b != sVar) {
                        Object obj = this.f8220b.get();
                        this.f8221c = obj;
                        this.f8220b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8221c;
    }

    public final String toString() {
        Object obj = this.f8220b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f8221c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
