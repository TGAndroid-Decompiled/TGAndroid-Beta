package b2;

import java.util.Collections;
import java.util.List;
public final class r1 {
    public static final String f2321c;
    public static final String d;
    public final q1 f2322a;
    public final e9.n0 f2323b;

    static {
        String str = e2.m0.f8375a;
        f2321c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public r1(q1 q1Var, int i10) {
        this(q1Var, e9.n0.y(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f2322a.equals(r1Var.f2322a) && this.f2323b.equals(r1Var.f2323b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2323b.hashCode() * 31) + this.f2322a.hashCode();
    }

    public r1(q1 q1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= q1Var.f2295a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f2322a = q1Var;
        this.f2323b = e9.n0.u(list);
    }
}
