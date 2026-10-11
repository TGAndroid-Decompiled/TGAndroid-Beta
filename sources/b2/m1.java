package b2;

import java.util.Collections;
import java.util.List;
public final class m1 {
    public static final String f3443c;
    public static final String d;
    public final l1 f3444a;
    public final e9.i0 f3445b;

    static {
        String str = e2.d0.f8531a;
        f3443c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public m1(l1 l1Var, int i10) {
        this(l1Var, e9.i0.z(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f3444a.equals(m1Var.f3444a) && this.f3445b.equals(m1Var.f3445b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3445b.hashCode() * 31) + this.f3444a.hashCode();
    }

    public m1(l1 l1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l1Var.f3415a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3444a = l1Var;
        this.f3445b = e9.i0.v(list);
    }
}
