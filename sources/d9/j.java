package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f7555a = new Object();
    public final i f7556b;
    public volatile transient boolean f7557c;
    public transient Object d;

    public j(i iVar) {
        this.f7556b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f7557c) {
            synchronized (this.f7555a) {
                try {
                    if (!this.f7557c) {
                        Object obj = this.f7556b.get();
                        this.d = obj;
                        this.f7557c = true;
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
        if (this.f7557c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7556b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
