package i2;

import j$.util.Objects;
public final class o1 {
    public static final o1 f10836b;
    public final e9.m0 f10837a;

    static {
        android.support.v4.media.c cVar = new android.support.v4.media.c(18);
        cVar.f1812b = e9.m0.u(2, 1, 5);
        f10836b = new o1(cVar);
    }

    public o1(android.support.v4.media.c cVar) {
        this.f10837a = (e9.m0) cVar.f1812b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o1) && this.f10837a.equals(((o1) obj).f10837a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f10837a, null, null, bool, bool, bool, bool);
    }
}
