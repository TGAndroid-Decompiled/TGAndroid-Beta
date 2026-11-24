package defpackage;

import java.util.Collections;
import java.util.List;
public final class yxb {
    public static final String c;
    public static final String d;
    public final sxb a;
    public final mm5 b;

    static {
        String str = g8c.a;
        c = "0";
        d = "1";
    }

    public yxb(sxb sxbVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= sxbVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = sxbVar;
        this.b = mm5.q(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yxb.class == obj.getClass()) {
            yxb yxbVar = (yxb) obj;
            if (this.a.equals(yxbVar.a) && this.b.equals(yxbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public yxb(sxb sxbVar, int i) {
        this(sxbVar, mm5.u(Integer.valueOf(i)));
    }
}
