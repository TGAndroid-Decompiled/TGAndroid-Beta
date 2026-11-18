package g9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f13261a = new Object();
    public final t f13262b;
    public volatile transient boolean f13263c;
    public transient Object d;

    public u(t tVar) {
        this.f13262b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f13263c) {
            synchronized (this.f13261a) {
                try {
                    if (!this.f13263c) {
                        Object obj = this.f13262b.get();
                        this.d = obj;
                        this.f13263c = true;
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
        if (this.f13263c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f13262b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
