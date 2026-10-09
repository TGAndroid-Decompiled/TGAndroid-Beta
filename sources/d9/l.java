package d9;

import a3.s;
public final class l implements j {
    public static final s d = new s(1);
    public final Object f8222a = new Object();
    public volatile j f8223b;
    public Object f8224c;

    public l(j jVar) {
        this.f8223b = jVar;
    }

    @Override
    public final Object get() {
        j jVar = this.f8223b;
        s sVar = d;
        if (jVar != sVar) {
            synchronized (this.f8222a) {
                try {
                    if (this.f8223b != sVar) {
                        Object obj = this.f8223b.get();
                        this.f8224c = obj;
                        this.f8223b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f8224c;
    }

    public final String toString() {
        Object obj = this.f8223b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f8224c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
