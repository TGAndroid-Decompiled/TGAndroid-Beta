package defpackage;

import java.io.Serializable;
public final class zeb implements d26, Serializable {
    public pr4 a;
    public volatile Object b;
    public final Object c;

    public zeb(pr4 pr4Var) {
        pr4Var.getClass();
        this.a = pr4Var;
        this.b = nf5.d;
        this.c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        nf5 nf5Var = nf5.d;
        if (obj2 != nf5Var) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == nf5Var) {
                pr4 pr4Var = this.a;
                pr4Var.getClass();
                obj = pr4Var.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.b != nf5.d) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
