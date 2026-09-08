package d9;

import a3.s;
public final class l implements j {
    public static final s d = new s(1);
    public final Object f6670a = new Object();
    public volatile j f6671b;
    public Object f6672c;

    public l(j jVar) {
        this.f6671b = jVar;
    }

    @Override
    public final Object get() {
        j jVar = this.f6671b;
        s sVar = d;
        if (jVar != sVar) {
            synchronized (this.f6670a) {
                try {
                    if (this.f6671b != sVar) {
                        Object obj = this.f6671b.get();
                        this.f6672c = obj;
                        this.f6671b = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6672c;
    }

    public final String toString() {
        Object obj = this.f6671b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.f6672c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
