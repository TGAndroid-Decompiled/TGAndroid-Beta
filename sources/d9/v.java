package d9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f6447a = new Object();
    public final u f6448b;
    public volatile transient boolean f6449c;
    public transient Object d;

    public v(u uVar) {
        this.f6448b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f6449c) {
            synchronized (this.f6447a) {
                try {
                    if (!this.f6449c) {
                        Object obj = this.f6448b.get();
                        this.d = obj;
                        this.f6449c = true;
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
        if (this.f6449c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f6448b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
