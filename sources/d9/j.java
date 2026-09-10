package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f6342a = new Object();
    public final i f6343b;
    public volatile transient boolean f6344c;
    public transient Object d;

    public j(i iVar) {
        this.f6343b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f6344c) {
            synchronized (this.f6342a) {
                try {
                    if (!this.f6344c) {
                        Object obj = this.f6343b.get();
                        this.d = obj;
                        this.f6344c = true;
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
        if (this.f6344c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f6343b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
