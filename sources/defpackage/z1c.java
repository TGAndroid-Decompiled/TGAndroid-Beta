package defpackage;

import java.util.Collections;
import java.util.List;
public final class z1c {
    public static final String c;
    public static final String d;
    public final t1c a;
    public final po5 b;

    static {
        String str = gcc.a;
        c = "0";
        d = "1";
    }

    public z1c(t1c t1cVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= t1cVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = t1cVar;
        this.b = po5.q(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z1c.class == obj.getClass()) {
            z1c z1cVar = (z1c) obj;
            if (this.a.equals(z1cVar.a) && this.b.equals(z1cVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public z1c(t1c t1cVar, int i) {
        this(t1cVar, po5.u(Integer.valueOf(i)));
    }
}
