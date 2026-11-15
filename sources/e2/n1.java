package e2;

import java.util.Collections;
import java.util.List;
public final class n1 {
    public static final String f10236c;
    public static final String d;
    public final m1 f10237a;
    public final h9.i0 f10238b;

    static {
        String str = h2.l0.f13471a;
        f10236c = Integer.toString(0, 36);
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
            if (this.f10237a.equals(n1Var.f10237a) && this.f10238b.equals(n1Var.f10238b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10238b.hashCode() * 31) + this.f10237a.hashCode();
    }

    public n1(m1 m1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m1Var.f10209a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f10237a = m1Var;
        this.f10238b = h9.i0.q(list);
    }
}
