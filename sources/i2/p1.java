package i2;

import j$.util.Objects;
public final class p1 {
    public static final p1 f10859b;
    public final e9.m0 f10860a;

    static {
        a4.m mVar = new a4.m(19);
        mVar.f275b = e9.m0.u(2, 1, 5);
        f10859b = new p1(mVar);
    }

    public p1(a4.m mVar) {
        this.f10860a = (e9.m0) mVar.f275b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p1) && this.f10860a.equals(((p1) obj).f10860a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f10860a, null, null, bool, bool, bool, bool);
    }
}
