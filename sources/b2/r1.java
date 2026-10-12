package b2;

import java.util.Collections;
import java.util.List;
public final class r1 {
    public static final String f2317c;
    public static final String d;
    public final q1 f2318a;
    public final e9.n0 f2319b;

    static {
        String str = e2.m0.f8372a;
        f2317c = Integer.toString(0, 36);
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
            if (this.f2318a.equals(r1Var.f2318a) && this.f2319b.equals(r1Var.f2319b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2319b.hashCode() * 31) + this.f2318a.hashCode();
    }

    public r1(q1 q1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= q1Var.f2291a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f2318a = q1Var;
        this.f2319b = e9.n0.u(list);
    }
}
