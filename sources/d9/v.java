package d9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f7900a = new Object();
    public final u f7901b;
    public volatile transient boolean f7902c;
    public transient Object d;

    public v(u uVar) {
        this.f7901b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f7902c) {
            synchronized (this.f7900a) {
                try {
                    if (!this.f7902c) {
                        Object obj = this.f7901b.get();
                        this.d = obj;
                        this.f7902c = true;
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
        if (this.f7902c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7901b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
