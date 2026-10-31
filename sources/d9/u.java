package d9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f5813a = new Object();
    public final t f5814b;
    public volatile transient boolean f5815c;
    public transient Object d;

    public u(t tVar) {
        this.f5814b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f5815c) {
            synchronized (this.f5813a) {
                try {
                    if (!this.f5815c) {
                        Object obj = this.f5814b.get();
                        this.d = obj;
                        this.f5815c = true;
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
        if (this.f5815c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f5814b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
