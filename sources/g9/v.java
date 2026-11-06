package g9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f13600a = new Object();
    public final u f13601b;
    public volatile transient boolean f13602c;
    public transient Object d;

    public v(u uVar) {
        this.f13601b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f13602c) {
            synchronized (this.f13600a) {
                try {
                    if (!this.f13602c) {
                        Object obj = this.f13601b.get();
                        this.d = obj;
                        this.f13602c = true;
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
        if (this.f13602c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f13601b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
