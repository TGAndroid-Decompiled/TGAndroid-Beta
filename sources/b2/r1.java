package b2;

import java.util.Collections;
import java.util.List;
public final class r1 {
    public static final String f3384c;
    public static final String d;
    public final q1 f3385a;
    public final f9.i0 f3386b;

    static {
        String str = e2.n0.f9691a;
        f3384c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public r1(q1 q1Var, int i10) {
        this(q1Var, f9.i0.y(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3385a.equals(r1Var.f3385a) && this.f3386b.equals(r1Var.f3386b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3386b.hashCode() * 31) + this.f3385a.hashCode();
    }

    public r1(q1 q1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= q1Var.f3358a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3385a = q1Var;
        this.f3386b = f9.i0.u(list);
    }
}
