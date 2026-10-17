package b2;

import java.util.Collections;
import java.util.List;
public final class q1 {
    public static final String f3929c;
    public static final String d;
    public final p1 f3930a;
    public final e9.n0 f3931b;

    static {
        String str = e2.m0.f8254a;
        f3929c = Integer.toString(0, 36);
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
            if (this.f3930a.equals(q1Var.f3930a) && this.f3931b.equals(q1Var.f3931b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3931b.hashCode() * 31) + this.f3930a.hashCode();
    }

    public q1(p1 p1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= p1Var.f3903a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3930a = p1Var;
        this.f3931b = e9.n0.u(list);
    }
}
