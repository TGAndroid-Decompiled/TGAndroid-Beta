package f9;

import java.io.Serializable;
public final class a2 extends q1 implements Serializable {
    public final q1 f10253a;

    public a2(q1 q1Var) {
        this.f10253a = q1Var;
    }

    @Override
    public final q1 a() {
        return this.f10253a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f10253a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            return this.f10253a.equals(((a2) obj).f10253a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f10253a.hashCode();
    }

    public final String toString() {
        return this.f10253a + ".reverse()";
    }
}
