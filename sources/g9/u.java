package g9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f13290a = new Object();
    public final t f13291b;
    public volatile transient boolean f13292c;
    public transient Object d;

    public u(t tVar) {
        this.f13291b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f13292c) {
            synchronized (this.f13290a) {
                try {
                    if (!this.f13292c) {
                        Object obj = this.f13291b.get();
                        this.d = obj;
                        this.f13292c = true;
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
        if (this.f13292c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f13291b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
