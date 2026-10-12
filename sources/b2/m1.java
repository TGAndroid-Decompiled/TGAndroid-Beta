package b2;

import java.util.Collections;
import java.util.List;
public final class m1 {
    public static final String f3441c;
    public static final String d;
    public final l1 f3442a;
    public final e9.i0 f3443b;

    static {
        String str = e2.d0.f8529a;
        f3441c = Integer.toString(0, 36);
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
            if (this.f3442a.equals(m1Var.f3442a) && this.f3443b.equals(m1Var.f3443b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3443b.hashCode() * 31) + this.f3442a.hashCode();
    }

    public m1(l1 l1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l1Var.f3413a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3442a = l1Var;
        this.f3443b = e9.i0.v(list);
    }
}
