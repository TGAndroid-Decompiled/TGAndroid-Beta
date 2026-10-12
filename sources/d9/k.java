package d9;

import java.io.Serializable;
public final class k implements j, Serializable {
    public final transient Object f8216a = new Object();
    public final j f8217b;
    public volatile transient boolean f8218c;
    public transient Object d;

    public k(j jVar) {
        this.f8217b = jVar;
    }

    @Override
    public final Object get() {
        if (!this.f8218c) {
            synchronized (this.f8216a) {
                try {
                    if (!this.f8218c) {
                        Object obj = this.f8217b.get();
                        this.d = obj;
                        this.f8218c = true;
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
        if (this.f8218c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f8217b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
