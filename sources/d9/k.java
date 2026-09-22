package d9;

import java.io.Serializable;
public final class k implements j, Serializable {
    public final transient Object f7570a = new Object();
    public final j f7571b;
    public volatile transient boolean f7572c;
    public transient Object d;

    public k(j jVar) {
        this.f7571b = jVar;
    }

    @Override
    public final Object get() {
        if (!this.f7572c) {
            synchronized (this.f7570a) {
                try {
                    if (!this.f7572c) {
                        Object obj = this.f7571b.get();
                        this.d = obj;
                        this.f7572c = true;
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
        if (this.f7572c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7571b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
