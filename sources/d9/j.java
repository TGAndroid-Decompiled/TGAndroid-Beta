package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f7566a = new Object();
    public final i f7567b;
    public volatile transient boolean f7568c;
    public transient Object d;

    public j(i iVar) {
        this.f7567b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f7568c) {
            synchronized (this.f7566a) {
                try {
                    if (!this.f7568c) {
                        Object obj = this.f7567b.get();
                        this.d = obj;
                        this.f7568c = true;
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
        if (this.f7568c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7567b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
