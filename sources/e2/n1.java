package e2;

import java.util.Collections;
import java.util.List;
public final class n1 {
    public static final String f10405c;
    public static final String d;
    public final m1 f10406a;
    public final h9.i0 f10407b;

    static {
        String str = h2.m0.f14114a;
        f10405c = Integer.toString(0, 36);
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
            if (this.f10406a.equals(n1Var.f10406a) && this.f10407b.equals(n1Var.f10407b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10407b.hashCode() * 31) + this.f10406a.hashCode();
    }

    public n1(m1 m1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m1Var.f10378a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f10406a = m1Var;
        this.f10407b = h9.i0.q(list);
    }
}
