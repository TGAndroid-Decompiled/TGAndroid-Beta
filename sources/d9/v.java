package d9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f7912a = new Object();
    public final u f7913b;
    public volatile transient boolean f7914c;
    public transient Object d;

    public v(u uVar) {
        this.f7913b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f7914c) {
            synchronized (this.f7912a) {
                try {
                    if (!this.f7914c) {
                        Object obj = this.f7913b.get();
                        this.d = obj;
                        this.f7914c = true;
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
        if (this.f7914c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7913b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
