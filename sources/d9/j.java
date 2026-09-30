package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f7553a = new Object();
    public final i f7554b;
    public volatile transient boolean f7555c;
    public transient Object d;

    public j(i iVar) {
        this.f7554b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f7555c) {
            synchronized (this.f7553a) {
                try {
                    if (!this.f7555c) {
                        Object obj = this.f7554b.get();
                        this.d = obj;
                        this.f7555c = true;
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
        if (this.f7555c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f7554b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
