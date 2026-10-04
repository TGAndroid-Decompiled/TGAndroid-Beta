package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f8168a = new Object();
    public final i f8169b;
    public volatile transient boolean f8170c;
    public transient Object d;

    public j(i iVar) {
        this.f8169b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f8170c) {
            synchronized (this.f8168a) {
                try {
                    if (!this.f8170c) {
                        Object obj = this.f8169b.get();
                        this.d = obj;
                        this.f8170c = true;
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
        if (this.f8170c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f8169b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
