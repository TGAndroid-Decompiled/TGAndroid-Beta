package i2;

import j$.util.Objects;
public final class p1 {
    public static final p1 f10848b;
    public final e9.m0 f10849a;

    static {
        a4.m mVar = new a4.m(18);
        mVar.f275b = e9.m0.u(2, 1, 5);
        f10848b = new p1(mVar);
    }

    public p1(a4.m mVar) {
        this.f10849a = (e9.m0) mVar.f275b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p1) && this.f10849a.equals(((p1) obj).f10849a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f10849a, null, null, bool, bool, bool, bool);
    }
}
