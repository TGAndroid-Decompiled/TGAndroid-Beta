package i2;

import j$.util.Objects;
public final class r1 {
    public static final r1 f12573b;
    public final e9.y0 f12574a;

    static {
        qb.c cVar = new qb.c(27);
        cVar.f44427b = e9.y0.t(2, 1, 5);
        f12573b = new r1(cVar);
    }

    public r1(qb.c cVar) {
        this.f12574a = (e9.y0) cVar.f44427b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r1) && this.f12574a.equals(((r1) obj).f12574a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f12574a, null, null, bool, bool, bool, bool, bool);
    }
}
