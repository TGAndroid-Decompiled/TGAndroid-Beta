package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f7571a = new Object();
    public final i f7572b;
    public volatile transient boolean f7573c;
    public transient Object d;

    public j(i iVar) {
        this.f7572b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f7573c) {
            synchronized (this.f7571a) {
                try {
                    if (!this.f7573c) {
                        Object obj = this.f7572b.get();
                        this.d = obj;
                        this.f7573c = true;
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
        if (this.f7573c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7572b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
