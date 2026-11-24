package defpackage;

import java.io.Serializable;
public final class eq2 extends at7 implements Serializable {
    public final x03 a;

    public eq2(x03 x03Var) {
        this.a = x03Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof eq2) && this.a == ((eq2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
