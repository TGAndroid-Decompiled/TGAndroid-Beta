package i2;

import j$.util.Objects;
public final class u1 {
    public static final u1 f8094b;
    public final e9.y0 f8095a;

    static {
        a4.l lVar = new a4.l(20);
        lVar.f279b = e9.y0.t(2, 1, 5);
        f8094b = new u1(lVar);
    }

    public u1(a4.l lVar) {
        this.f8095a = (e9.y0) lVar.f279b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u1) && this.f8095a.equals(((u1) obj).f8095a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f8095a, null, null, bool, bool, bool, bool, bool);
    }
}
