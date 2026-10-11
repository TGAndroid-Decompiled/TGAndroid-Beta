package d9;

import java.io.Serializable;
public final class k implements j, Serializable {
    public final transient Object f8218a = new Object();
    public final j f8219b;
    public volatile transient boolean f8220c;
    public transient Object d;

    public k(j jVar) {
        this.f8219b = jVar;
    }

    @Override
    public final Object get() {
        if (!this.f8220c) {
            synchronized (this.f8218a) {
                try {
                    if (!this.f8220c) {
                        Object obj = this.f8219b.get();
                        this.d = obj;
                        this.f8220c = true;
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
        if (this.f8220c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f8219b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
