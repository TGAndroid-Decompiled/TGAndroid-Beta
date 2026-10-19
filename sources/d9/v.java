package d9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f7902a = new Object();
    public final u f7903b;
    public volatile transient boolean f7904c;
    public transient Object d;

    public v(u uVar) {
        this.f7903b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f7904c) {
            synchronized (this.f7902a) {
                try {
                    if (!this.f7904c) {
                        Object obj = this.f7903b.get();
                        this.d = obj;
                        this.f7904c = true;
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
        if (this.f7904c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7903b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
