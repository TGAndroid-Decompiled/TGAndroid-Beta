package d9;

import java.io.Serializable;
public final class k implements j, Serializable {
    public final transient Object f8219a = new Object();
    public final j f8220b;
    public volatile transient boolean f8221c;
    public transient Object d;

    public k(j jVar) {
        this.f8220b = jVar;
    }

    @Override
    public final Object get() {
        if (!this.f8221c) {
            synchronized (this.f8219a) {
                try {
                    if (!this.f8221c) {
                        Object obj = this.f8220b.get();
                        this.d = obj;
                        this.f8221c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f8221c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f8220b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
