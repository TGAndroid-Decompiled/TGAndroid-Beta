package g9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f13255a = new Object();
    public final t f13256b;
    public volatile transient boolean f13257c;
    public transient Object d;

    public u(t tVar) {
        this.f13256b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f13257c) {
            synchronized (this.f13255a) {
                try {
                    if (!this.f13257c) {
                        Object obj = this.f13256b.get();
                        this.d = obj;
                        this.f13257c = true;
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
        if (this.f13257c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f13256b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
