package i2;

import j$.util.Objects;
public final class o1 {
    public static final o1 f11688b;
    public final e9.m0 f11689a;

    static {
        a6.i iVar = new a6.i(24);
        iVar.f312b = e9.m0.u(2, 1, 5);
        f11688b = new o1(iVar);
    }

    public o1(a6.i iVar) {
        this.f11689a = (e9.m0) iVar.f312b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o1) && this.f11689a.equals(((o1) obj).f11689a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f11689a, null, null, bool, bool, bool, bool);
    }
}
