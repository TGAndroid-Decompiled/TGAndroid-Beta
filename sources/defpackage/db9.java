package defpackage;

import java.io.Serializable;
public final class db9 extends yq7 implements Serializable {
    public final yq7 a;

    public db9(yq7 yq7Var) {
        this.a = yq7Var;
    }

    @Override
    public final yq7 a() {
        return this.a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof db9) {
            return this.a.equals(((db9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
