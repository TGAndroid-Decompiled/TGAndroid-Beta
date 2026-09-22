package i2;

import j$.util.Objects;
public final class o1 {
    public static final o1 f10834b;
    public final e9.m0 f10835a;

    static {
        a4.m mVar = new a4.m(18, false);
        mVar.f275b = e9.m0.u(2, 1, 5);
        f10834b = new o1(mVar);
    }

    public o1(a4.m mVar) {
        this.f10835a = (e9.m0) mVar.f275b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o1) && this.f10835a.equals(((o1) obj).f10835a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f10835a, null, null, bool, bool, bool, bool);
    }
}
