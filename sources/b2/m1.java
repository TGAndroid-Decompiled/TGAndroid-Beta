package b2;

import java.util.Collections;
import java.util.List;
public final class m1 {
    public static final String f2197c;
    public static final String d;
    public final l1 f2198a;
    public final e9.i0 f2199b;

    static {
        String str = e2.d0.f8765a;
        f2197c = Integer.toString(0, 36);
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
            if (this.f2198a.equals(m1Var.f2198a) && this.f2199b.equals(m1Var.f2199b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2199b.hashCode() * 31) + this.f2198a.hashCode();
    }

    public m1(l1 l1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l1Var.f2169a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f2198a = l1Var;
        this.f2199b = e9.i0.v(list);
    }
}
