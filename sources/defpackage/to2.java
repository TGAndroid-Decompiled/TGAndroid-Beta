package defpackage;

import java.io.Serializable;
public final class to2 extends yq7 implements Serializable {
    public final mz2 a;

    public to2(mz2 mz2Var) {
        this.a = mz2Var;
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
        if ((obj instanceof to2) && this.a == ((to2) obj).a) {
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
