package d9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f7903a = new Object();
    public final u f7904b;
    public volatile transient boolean f7905c;
    public transient Object d;

    public v(u uVar) {
        this.f7904b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f7905c) {
            synchronized (this.f7903a) {
                try {
                    if (!this.f7905c) {
                        Object obj = this.f7904b.get();
                        this.d = obj;
                        this.f7905c = true;
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
        if (this.f7905c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7904b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
