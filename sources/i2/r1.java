package i2;

import j$.util.Objects;
public final class r1 {
    public static final r1 f12575b;
    public final e9.y0 f12576a;

    static {
        qb.c cVar = new qb.c(27);
        cVar.f44425b = e9.y0.t(2, 1, 5);
        f12575b = new r1(cVar);
    }

    public r1(qb.c cVar) {
        this.f12576a = (e9.y0) cVar.f44425b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r1) && this.f12576a.equals(((r1) obj).f12576a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f12576a, null, null, bool, bool, bool, bool, bool);
    }
}
