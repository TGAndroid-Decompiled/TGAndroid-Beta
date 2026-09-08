package d9;

import java.io.Serializable;
public final class k implements j, Serializable {
    public final transient Object f6667a = new Object();
    public final j f6668b;
    public volatile transient boolean f6669c;
    public transient Object d;

    public k(j jVar) {
        this.f6668b = jVar;
    }

    @Override
    public final Object get() {
        if (!this.f6669c) {
            synchronized (this.f6667a) {
                try {
                    if (!this.f6669c) {
                        Object obj = this.f6668b.get();
                        this.d = obj;
                        this.f6669c = true;
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
        if (this.f6669c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f6668b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
