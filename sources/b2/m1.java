package b2;

import java.util.Collections;
import java.util.List;
public final class m1 {
    public static final String f1810c;
    public static final String d;
    public final l1 f1811a;
    public final e9.i0 f1812b;

    static {
        String str = e2.d0.f7188a;
        f1810c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public m1(l1 l1Var, int i10) {
        this(l1Var, e9.i0.z(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f1811a.equals(m1Var.f1811a) && this.f1812b.equals(m1Var.f1812b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1812b.hashCode() * 31) + this.f1811a.hashCode();
    }

    public m1(l1 l1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l1Var.f1784a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f1811a = l1Var;
        this.f1812b = e9.i0.v(list);
    }
}
