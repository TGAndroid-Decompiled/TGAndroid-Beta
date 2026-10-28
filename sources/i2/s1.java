package i2;

import j$.util.Objects;
public final class s1 {
    public static final s1 f13758b;
    public final f9.t0 f13759a;

    static {
        rb.c cVar = new rb.c(27);
        cVar.f47358b = f9.t0.t(2, 1, 5);
        f13758b = new s1(cVar);
    }

    public s1(rb.c cVar) {
        this.f13759a = (f9.t0) cVar.f47358b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s1) && this.f13759a.equals(((s1) obj).f13759a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f13759a, null, null, bool, bool, bool, bool, bool);
    }
}
