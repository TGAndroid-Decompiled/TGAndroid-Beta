package e2;

import java.util.Collections;
import java.util.List;
public final class n1 {
    public static final String f10554c;
    public static final String d;
    public final m1 f10555a;
    public final h9.i0 f10556b;

    static {
        String str = h2.l0.f13786a;
        f10554c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public n1(m1 m1Var, int i7) {
        this(m1Var, h9.i0.u(Integer.valueOf(i7)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f10555a.equals(n1Var.f10555a) && this.f10556b.equals(n1Var.f10556b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10556b.hashCode() * 31) + this.f10555a.hashCode();
    }

    public n1(m1 m1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m1Var.f10527a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f10555a = m1Var;
        this.f10556b = h9.i0.q(list);
    }
}
