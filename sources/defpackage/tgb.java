package defpackage;

import java.io.Serializable;
public final class tgb implements h26, Serializable {
    public sr4 a;
    public volatile Object b;
    public final Object c;

    public tgb(sr4 sr4Var) {
        sr4Var.getClass();
        this.a = sr4Var;
        this.b = qf5.d;
        this.c = this;
    }

    @Override
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        qf5 qf5Var = qf5.d;
        if (obj2 != qf5Var) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == qf5Var) {
                sr4 sr4Var = this.a;
                sr4Var.getClass();
                obj = sr4Var.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.b != qf5.d) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
