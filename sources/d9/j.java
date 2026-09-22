package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f7568a = new Object();
    public final i f7569b;
    public volatile transient boolean f7570c;
    public transient Object d;

    public j(i iVar) {
        this.f7569b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f7570c) {
            synchronized (this.f7568a) {
                try {
                    if (!this.f7570c) {
                        Object obj = this.f7569b.get();
                        this.d = obj;
                        this.f7570c = true;
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
        if (this.f7570c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7569b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
