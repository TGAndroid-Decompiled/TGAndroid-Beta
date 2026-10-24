package i2;

import j$.util.Objects;
public final class r1 {
    public static final r1 f12608b;
    public final e9.y0 f12609a;

    static {
        qb.c cVar = new qb.c(27);
        cVar.f44851b = e9.y0.t(2, 1, 5);
        f12608b = new r1(cVar);
    }

    public r1(qb.c cVar) {
        this.f12609a = (e9.y0) cVar.f44851b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r1) && this.f12609a.equals(((r1) obj).f12609a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f12609a, null, null, bool, bool, bool, bool, bool);
    }
}
