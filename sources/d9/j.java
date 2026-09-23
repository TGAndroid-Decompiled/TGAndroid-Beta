package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f7554a = new Object();
    public final i f7555b;
    public volatile transient boolean f7556c;
    public transient Object d;

    public j(i iVar) {
        this.f7555b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f7556c) {
            synchronized (this.f7554a) {
                try {
                    if (!this.f7556c) {
                        Object obj = this.f7555b.get();
                        this.d = obj;
                        this.f7556c = true;
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
        if (this.f7556c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7555b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
