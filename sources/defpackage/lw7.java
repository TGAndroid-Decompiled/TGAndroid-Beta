package defpackage;

import java.io.Serializable;
public final class lw7 implements Serializable {
    public final Object a;
    public final Object b;

    public lw7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw7)) {
            return false;
        }
        lw7 lw7Var = (lw7) obj;
        if (rr5.a(this.a, lw7Var.a) && rr5.a(this.b, lw7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
