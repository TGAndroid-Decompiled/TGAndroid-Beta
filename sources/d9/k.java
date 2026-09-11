package d9;

import java.io.Serializable;
public final class k implements j, Serializable {
    public final transient Object f6640a = new Object();
    public final j f6641b;
    public volatile transient boolean f6642c;
    public transient Object d;

    public k(j jVar) {
        this.f6641b = jVar;
    }

    @Override
    public final Object get() {
        if (!this.f6642c) {
            synchronized (this.f6640a) {
                try {
                    if (!this.f6642c) {
                        Object obj = this.f6641b.get();
                        this.d = obj;
                        this.f6642c = true;
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
        if (this.f6642c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f6641b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
