package i2;

import j$.util.Objects;
public final class s1 {
    public static final s1 f11192b;
    public final e9.y0 f11193a;

    static {
        a6.m mVar = new a6.m(22);
        mVar.f311b = e9.y0.t(2, 1, 5);
        f11192b = new s1(mVar);
    }

    public s1(a6.m mVar) {
        this.f11193a = (e9.y0) mVar.f311b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s1) && this.f11193a.equals(((s1) obj).f11193a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f11193a, null, null, bool, bool, bool, bool, bool);
    }
}
