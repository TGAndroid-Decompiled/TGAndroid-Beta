package defpackage;

import java.io.Serializable;
public final class mp2 extends eu7 implements Serializable {
    public final f03 a;

    public mp2(f03 f03Var) {
        this.a = f03Var;
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
        if ((obj instanceof mp2) && this.a == ((mp2) obj).a) {
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
