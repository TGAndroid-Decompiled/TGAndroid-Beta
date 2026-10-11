package i2;

import j$.util.Objects;
public final class p1 {
    public static final p1 f11865b;
    public final e9.m0 f11866a;

    static {
        a6.i iVar = new a6.i(25, false);
        iVar.f326b = e9.m0.u(2, 1, 5);
        f11865b = new p1(iVar);
    }

    public p1(a6.i iVar) {
        this.f11866a = (e9.m0) iVar.f326b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p1) && this.f11866a.equals(((p1) obj).f11866a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f11866a, null, null, bool, bool, bool, bool);
    }
}
