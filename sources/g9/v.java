package g9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f13602a = new Object();
    public final u f13603b;
    public volatile transient boolean f13604c;
    public transient Object d;

    public v(u uVar) {
        this.f13603b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f13604c) {
            synchronized (this.f13602a) {
                try {
                    if (!this.f13604c) {
                        Object obj = this.f13603b.get();
                        this.d = obj;
                        this.f13604c = true;
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
        if (this.f13604c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f13603b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
