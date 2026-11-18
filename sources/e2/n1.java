package e2;

import java.util.Collections;
import java.util.List;
public final class n1 {
    public static final String f10551c;
    public static final String d;
    public final m1 f10552a;
    public final h9.i0 f10553b;

    static {
        String str = h2.l0.f13783a;
        f10551c = Integer.toString(0, 36);
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
            if (this.f10552a.equals(n1Var.f10552a) && this.f10553b.equals(n1Var.f10553b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10553b.hashCode() * 31) + this.f10552a.hashCode();
    }

    public n1(m1 m1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m1Var.f10524a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f10552a = m1Var;
        this.f10553b = h9.i0.q(list);
    }
}
