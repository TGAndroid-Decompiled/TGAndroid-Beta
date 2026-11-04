package f9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f11521a = new Object();
    public final t f11522b;
    public volatile transient boolean f11523c;
    public transient Object d;

    public u(t tVar) {
        this.f11522b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f11523c) {
            synchronized (this.f11521a) {
                try {
                    if (!this.f11523c) {
                        Object obj = this.f11522b.get();
                        this.d = obj;
                        this.f11523c = true;
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
        if (this.f11523c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f11522b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
