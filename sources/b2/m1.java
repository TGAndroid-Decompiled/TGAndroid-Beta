package b2;

import java.util.Collections;
import java.util.List;
public final class m1 {
    public static final String f3364c;
    public static final String d;
    public final l1 f3365a;
    public final e9.i0 f3366b;

    static {
        String str = e2.d0.f8537a;
        f3364c = Integer.toString(0, 36);
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
            if (this.f3365a.equals(m1Var.f3365a) && this.f3366b.equals(m1Var.f3366b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3366b.hashCode() * 31) + this.f3365a.hashCode();
    }

    public m1(l1 l1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l1Var.f3336a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3365a = l1Var;
        this.f3366b = e9.i0.v(list);
    }
}
