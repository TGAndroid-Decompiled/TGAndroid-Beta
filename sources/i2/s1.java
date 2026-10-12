package i2;

import j$.util.Objects;
public final class s1 {
    public static final s1 f11188b;
    public final e9.y0 f11189a;

    static {
        qb.c cVar = new qb.c(23);
        cVar.f43343b = e9.y0.t(2, 1, 5);
        f11188b = new s1(cVar);
    }

    public s1(qb.c cVar) {
        this.f11189a = (e9.y0) cVar.f43343b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s1) && this.f11189a.equals(((s1) obj).f11189a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f11189a, null, null, bool, bool, bool, bool, bool);
    }
}
