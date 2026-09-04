package b2;

import java.util.Collections;
import java.util.List;
public final class m1 {
    public static final String f2170c;
    public static final String d;
    public final l1 f2171a;
    public final e9.i0 f2172b;

    static {
        String str = e2.d0.f8737a;
        f2170c = Integer.toString(0, 36);
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
            if (this.f2171a.equals(m1Var.f2171a) && this.f2172b.equals(m1Var.f2172b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2172b.hashCode() * 31) + this.f2171a.hashCode();
    }

    public m1(l1 l1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l1Var.f2142a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f2171a = l1Var;
        this.f2172b = e9.i0.v(list);
    }
}
