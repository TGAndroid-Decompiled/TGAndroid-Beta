package e9;

import java.io.Serializable;
public final class f2 extends v1 implements Serializable {
    public final v1 f8561a;

    public f2(v1 v1Var) {
        this.f8561a = v1Var;
    }

    @Override
    public final v1 a() {
        return this.f8561a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8561a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            return this.f8561a.equals(((f2) obj).f8561a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f8561a.hashCode();
    }

    public final String toString() {
        return this.f8561a + ".reverse()";
    }
}
