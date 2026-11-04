package d2;

import java.util.Collections;
import java.util.List;
public final class p1 {
    public static final String f8283c;
    public static final String d;
    public final o1 f8284a;
    public final g9.i0 f8285b;

    static {
        String str = g2.n0.f11873a;
        f8283c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public p1(o1 o1Var, int i3) {
        this(o1Var, g9.i0.u(Integer.valueOf(i3)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f8284a.equals(p1Var.f8284a) && this.f8285b.equals(p1Var.f8285b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8285b.hashCode() * 31) + this.f8284a.hashCode();
    }

    public p1(o1 o1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= o1Var.f8252a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f8284a = o1Var;
        this.f8285b = g9.i0.q(list);
    }
}
