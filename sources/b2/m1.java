package b2;

import java.util.Collections;
import java.util.List;
public final class m1 {
    public static final String f3111c;
    public static final String d;
    public final l1 f3112a;
    public final e9.i0 f3113b;

    static {
        String str = e2.d0.f7872a;
        f3111c = Integer.toString(0, 36);
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
            if (this.f3112a.equals(m1Var.f3112a) && this.f3113b.equals(m1Var.f3113b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3113b.hashCode() * 31) + this.f3112a.hashCode();
    }

    public m1(l1 l1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l1Var.f3085a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3112a = l1Var;
        this.f3113b = e9.i0.v(list);
    }
}
