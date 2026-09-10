package i2;

import j$.util.Objects;
public final class n1 {
    public static final n1 f10311b;
    public final e9.m0 f10312a;

    static {
        xa.c cVar = new xa.c(26);
        cVar.f45077b = e9.m0.u(2, 1, 5);
        f10311b = new n1(cVar);
    }

    public n1(xa.c cVar) {
        this.f10312a = (e9.m0) cVar.f45077b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n1) && this.f10312a.equals(((n1) obj).f10312a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f10312a, null, null, bool, bool, bool, bool);
    }
}
