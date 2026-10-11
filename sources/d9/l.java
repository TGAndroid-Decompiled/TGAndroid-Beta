package d9;

import a3.s;
public final class l implements j {
    public static final s d = new s(1);
    public final Object f8221a = new Object();
    public volatile j f8222b;
    public Object f8223c;

    public l(j jVar) {
        this.f8222b = jVar;
    }

    @Override
    public final Object get() {
        j jVar = this.f8222b;
        s sVar = d;
        if (jVar != sVar) {
            synchronized (this.f8221a) {
                try {
                    if (this.f8222b != sVar) {
                        Object obj = this.f8222b.get();
                        this.f8223c = obj;
                        this.f8222b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8223c;
    }

    public final String toString() {
        Object obj = this.f8222b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f8223c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
