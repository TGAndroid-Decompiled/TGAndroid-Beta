package g9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f13256a = new Object();
    public final t f13257b;
    public volatile transient boolean f13258c;
    public transient Object d;

    public u(t tVar) {
        this.f13257b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f13258c) {
            synchronized (this.f13256a) {
                try {
                    if (!this.f13258c) {
                        Object obj = this.f13257b.get();
                        this.d = obj;
                        this.f13258c = true;
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
        if (this.f13258c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f13257b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
