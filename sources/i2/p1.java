package i2;

import j$.util.Objects;
public final class p1 {
    public static final p1 f11816b;
    public final e9.m0 f11817a;

    static {
        a6.m mVar = new a6.m(23);
        mVar.f330b = e9.m0.u(2, 1, 5);
        f11816b = new p1(mVar);
    }

    public p1(a6.m mVar) {
        this.f11817a = (e9.m0) mVar.f330b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p1) && this.f11817a.equals(((p1) obj).f11817a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f11817a, null, null, bool, bool, bool, bool);
    }
}
