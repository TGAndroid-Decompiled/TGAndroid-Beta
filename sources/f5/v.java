package f5;

import h5.d0;
import java.util.Collections;
import java.util.List;
import o4.s0;
public final class v implements j3.g {
    public static final String f6070c;
    public static final String d;
    public final s0 f6071a;
    public final s8.v f6072b;

    static {
        int i10 = d0.f7237a;
        f6070c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public v(s0 s0Var, int i10) {
        this(s0Var, s8.v.x(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f6071a.equals(vVar.f6071a) && this.f6072b.equals(vVar.f6072b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6072b.hashCode() * 31) + this.f6071a.hashCode();
    }

    public v(s0 s0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= s0Var.f16571a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f6071a = s0Var;
        this.f6072b = s8.v.t(list);
    }
}
