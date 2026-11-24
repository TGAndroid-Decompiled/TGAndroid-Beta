package defpackage;

import java.io.Serializable;
public final class dd9 extends at7 implements Serializable {
    public final at7 a;

    public dd9(at7 at7Var) {
        this.a = at7Var;
    }

    @Override
    public final at7 a() {
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
        if (obj instanceof dd9) {
            return this.a.equals(((dd9) obj).a);
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
