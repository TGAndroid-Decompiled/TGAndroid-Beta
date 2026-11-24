package defpackage;

import java.io.Serializable;
public final class ycb implements d06, Serializable {
    public op4 a;
    public volatile Object b;
    public final Object c;

    public ycb(op4 op4Var) {
        op4Var.getClass();
        this.a = op4Var;
        this.b = pd5.d;
        this.c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        pd5 pd5Var = pd5.d;
        if (obj2 != pd5Var) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == pd5Var) {
                op4 op4Var = this.a;
                op4Var.getClass();
                obj = op4Var.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.b != pd5.d) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
