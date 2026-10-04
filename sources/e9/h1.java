package e9;

import java.io.Serializable;
public final class h1 extends y0 implements Serializable {
    public final y0 f8756a;

    public h1(y0 y0Var) {
        this.f8756a = y0Var;
    }

    @Override
    public final y0 a() {
        return this.f8756a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8756a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            return this.f8756a.equals(((h1) obj).f8756a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f8756a.hashCode();
    }

    public final String toString() {
        return this.f8756a + ".reverse()";
    }
}
