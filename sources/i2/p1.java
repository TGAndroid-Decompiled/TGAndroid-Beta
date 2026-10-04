package i2;

import j$.util.Objects;
public final class p1 {
    public static final p1 f11815b;
    public final e9.m0 f11816a;

    static {
        a6.m mVar = new a6.m(23);
        mVar.f330b = e9.m0.u(2, 1, 5);
        f11815b = new p1(mVar);
    }

    public p1(a6.m mVar) {
        this.f11816a = (e9.m0) mVar.f330b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p1) && this.f11816a.equals(((p1) obj).f11816a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f11816a, null, null, bool, bool, bool, bool);
    }
}
