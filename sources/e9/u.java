package e9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f9852a = new Object();
    public final t f9853b;
    public volatile transient boolean f9854c;
    public transient Object d;

    public u(t tVar) {
        this.f9853b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f9854c) {
            synchronized (this.f9852a) {
                try {
                    if (!this.f9854c) {
                        Object obj = this.f9853b.get();
                        this.d = obj;
                        this.f9854c = true;
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
        if (this.f9854c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f9853b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
