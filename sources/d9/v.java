package d9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f7901a = new Object();
    public final u f7902b;
    public volatile transient boolean f7903c;
    public transient Object d;

    public v(u uVar) {
        this.f7902b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f7903c) {
            synchronized (this.f7901a) {
                try {
                    if (!this.f7903c) {
                        Object obj = this.f7902b.get();
                        this.d = obj;
                        this.f7903c = true;
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
        if (this.f7903c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7902b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
