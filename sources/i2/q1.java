package i2;

import j$.util.Objects;
public final class q1 {
    public static final q1 f12572b;
    public final e9.y0 f12573a;

    static {
        a6.m mVar = new a6.m(27);
        mVar.f310b = e9.y0.t(2, 1, 5);
        f12572b = new q1(mVar);
    }

    public q1(a6.m mVar) {
        this.f12573a = (e9.y0) mVar.f310b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof q1) && this.f12573a.equals(((q1) obj).f12573a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f12573a, null, null, bool, bool, bool, bool, bool);
    }
}
