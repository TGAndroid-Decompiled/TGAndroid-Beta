package l2;

import j$.util.Objects;
public final class o1 {
    public static final o1 f19154b;
    public final h9.t0 f19155a;

    static {
        ia.d dVar = new ia.d(7);
        dVar.f15881b = h9.t0.p(2, 1, 5);
        f19154b = new o1(dVar);
    }

    public o1(ia.d dVar) {
        this.f19155a = (h9.t0) dVar.f15881b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o1) && this.f19155a.equals(((o1) obj).f19155a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f19155a, null, null, bool, bool, bool, bool, bool);
    }
}
