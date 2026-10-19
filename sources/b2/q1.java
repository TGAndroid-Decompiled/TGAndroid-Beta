package b2;

import java.util.Collections;
import java.util.List;
public final class q1 {
    public static final String f3928c;
    public static final String d;
    public final p1 f3929a;
    public final e9.n0 f3930b;

    static {
        String str = e2.m0.f8254a;
        f3928c = Integer.toString(0, 36);
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
            if (this.f3929a.equals(q1Var.f3929a) && this.f3930b.equals(q1Var.f3930b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3930b.hashCode() * 31) + this.f3929a.hashCode();
    }

    public q1(p1 p1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= p1Var.f3902a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3929a = p1Var;
        this.f3930b = e9.n0.u(list);
    }
}
