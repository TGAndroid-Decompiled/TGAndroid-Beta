package defpackage;

import java.util.Collections;
import java.util.List;
public final class a0c {
    public static final String c;
    public static final String d;
    public final uzb a;
    public final mo5 b;

    static {
        String str = hac.a;
        c = "0";
        d = "1";
    }

    public a0c(uzb uzbVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= uzbVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = uzbVar;
        this.b = mo5.q(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0c.class == obj.getClass()) {
            a0c a0cVar = (a0c) obj;
            if (this.a.equals(a0cVar.a) && this.b.equals(a0cVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public a0c(uzb uzbVar, int i) {
        this(uzbVar, mo5.u(Integer.valueOf(i)));
    }
}
