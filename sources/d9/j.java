package d9;

import java.io.Serializable;
public final class j implements i, Serializable {
    public final transient Object f8169a = new Object();
    public final i f8170b;
    public volatile transient boolean f8171c;
    public transient Object d;

    public j(i iVar) {
        this.f8170b = iVar;
    }

    @Override
    public final Object get() {
        if (!this.f8171c) {
            synchronized (this.f8169a) {
                try {
                    if (!this.f8171c) {
                        Object obj = this.f8170b.get();
                        this.d = obj;
                        this.f8171c = true;
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
        if (this.f8171c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f8170b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
