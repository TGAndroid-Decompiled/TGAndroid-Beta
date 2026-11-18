package g9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f13264a = new Object();
    public final t f13265b;
    public volatile transient boolean f13266c;
    public transient Object d;

    public u(t tVar) {
        this.f13265b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f13266c) {
            synchronized (this.f13264a) {
                try {
                    if (!this.f13266c) {
                        Object obj = this.f13265b.get();
                        this.d = obj;
                        this.f13266c = true;
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
        if (this.f13266c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f13265b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
