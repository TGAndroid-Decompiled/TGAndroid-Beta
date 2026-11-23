package g9;

import java.io.Serializable;
public final class u implements t, Serializable {
    public final transient Object f13293a = new Object();
    public final t f13294b;
    public volatile transient boolean f13295c;
    public transient Object d;

    public u(t tVar) {
        this.f13294b = tVar;
    }

    @Override
    public final Object get() {
        if (!this.f13295c) {
            synchronized (this.f13293a) {
                try {
                    if (!this.f13295c) {
                        Object obj = this.f13294b.get();
                        this.d = obj;
                        this.f13295c = true;
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
        if (this.f13295c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.f13294b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
