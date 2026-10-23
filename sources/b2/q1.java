package b2;

import java.util.Collections;
import java.util.List;
public final class q1 {
    public static final String f3933c;
    public static final String d;
    public final p1 f3934a;
    public final e9.n0 f3935b;

    static {
        String str = e2.m0.f8259a;
        f3933c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public q1(p1 p1Var, int i10) {
        this(p1Var, e9.n0.y(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f3934a.equals(q1Var.f3934a) && this.f3935b.equals(q1Var.f3935b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3935b.hashCode() * 31) + this.f3934a.hashCode();
    }

    public q1(p1 p1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= p1Var.f3907a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3934a = p1Var;
        this.f3935b = e9.n0.u(list);
    }
}
