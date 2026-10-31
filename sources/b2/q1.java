package b2;

import java.util.Collections;
import java.util.List;
public final class q1 {
    public static final String f2195c;
    public static final String d;
    public final p1 f2196a;
    public final e9.n0 f2197b;

    static {
        String str = e2.l0.f6165a;
        f2195c = Integer.toString(0, 36);
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
            if (this.f2196a.equals(q1Var.f2196a) && this.f2197b.equals(q1Var.f2197b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2197b.hashCode() * 31) + this.f2196a.hashCode();
    }

    public q1(p1 p1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= p1Var.f2187a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f2196a = p1Var;
        this.f2197b = e9.n0.u(list);
    }
}
