package g9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f12947a = new Object();
    public final t f12948b;
    public volatile transient boolean f12949c;
    public transient Object d;

    public u(t tVar) {
        this.f12948b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f12949c) {
            synchronized (this.f12947a) {
                try {
                    if (!this.f12949c) {
                        Object obj = this.f12948b.get();
                        this.d = obj;
                        this.f12949c = true;
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
        if (this.f12949c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f12948b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
