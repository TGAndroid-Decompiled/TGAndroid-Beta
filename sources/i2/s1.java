package i2;

import j$.util.Objects;
public final class s1 {
    public static final s1 f13759b;
    public final f9.t0 f13760a;

    static {
        rb.c cVar = new rb.c(27);
        cVar.f47320b = f9.t0.t(2, 1, 5);
        f13759b = new s1(cVar);
    }

    public s1(rb.c cVar) {
        this.f13760a = (f9.t0) cVar.f47320b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s1) && this.f13760a.equals(((s1) obj).f13760a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f13760a, null, null, bool, bool, bool, bool, bool);
    }
}
