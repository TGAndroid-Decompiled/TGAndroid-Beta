package e9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f9853a = new Object();
    public final t f9854b;
    public volatile transient boolean f9855c;
    public transient Object d;

    public u(t tVar) {
        this.f9854b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f9855c) {
            synchronized (this.f9853a) {
                try {
                    if (!this.f9855c) {
                        Object obj = this.f9854b.get();
                        this.d = obj;
                        this.f9855c = true;
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
        if (this.f9855c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f9854b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
