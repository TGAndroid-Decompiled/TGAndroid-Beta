package b5;

import d5.f0;
import j4.i1;
import java.util.Collections;
import java.util.List;
public final class x implements h3.g {
    public static final String f1506c;
    public static final String d;
    public final i1 f1507a;
    public final o8.z f1508b;

    static {
        int i9 = f0.f4349a;
        f1506c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(i1 i1Var, int i9) {
        this(i1Var, o8.z.y(Integer.valueOf(i9)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f1507a.equals(xVar.f1507a) && this.f1508b.equals(xVar.f1508b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1508b.hashCode() * 31) + this.f1507a.hashCode();
    }

    public x(i1 i1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= i1Var.f13481a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f1507a = i1Var;
        this.f1508b = o8.z.u(list);
    }
}
