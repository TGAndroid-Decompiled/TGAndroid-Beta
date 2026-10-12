package d9;

import java.io.Serializable;
public final class v implements u, Serializable {
    public final transient Object f6444a = new Object();
    public final u f6445b;
    public volatile transient boolean f6446c;
    public transient Object d;

    public v(u uVar) {
        this.f6445b = uVar;
    }

    @Override
    public final Object get() {
        if (!this.f6446c) {
            synchronized (this.f6444a) {
                try {
                    if (!this.f6446c) {
                        Object obj = this.f6445b.get();
                        this.d = obj;
                        this.f6446c = true;
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
        if (this.f6446c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f6445b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
