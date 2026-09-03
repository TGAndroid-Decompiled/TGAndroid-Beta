package f5;

import h5.d0;
import java.util.Collections;
import java.util.List;
import o4.s0;
public final class u implements j3.g {
    public static final String f5954c;
    public static final String d;
    public final s0 f5955a;
    public final s8.v f5956b;

    static {
        int i10 = d0.f6924a;
        f5954c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public u(s0 s0Var, int i10) {
        this(s0Var, s8.v.x(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f5955a.equals(uVar.f5955a) && this.f5956b.equals(uVar.f5956b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5956b.hashCode() * 31) + this.f5955a.hashCode();
    }

    public u(s0 s0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= s0Var.f16400a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f5955a = s0Var;
        this.f5956b = s8.v.t(list);
    }
}
