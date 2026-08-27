package b5;

import d5.g0;
import j4.i1;
import java.util.Collections;
import java.util.List;

public final class w implements h3.g {

    public static final String f1991c;
    public static final String d;

    public final i1 f1992a;

    public final p8.z f1993b;

    static {
        int i10 = g0.f4795a;
        f1991c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(i1 i1Var, int i10) {
        this(i1Var, p8.z.y(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f1992a.equals(wVar.f1992a) && this.f1993b.equals(wVar.f1993b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1993b.hashCode() * 31) + this.f1992a.hashCode();
    }

    public w(i1 i1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= i1Var.f12583a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f1992a = i1Var;
        this.f1993b = p8.z.u(list);
    }
}
