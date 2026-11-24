package defpackage;

import j$.util.Objects;
public final class mr9 {
    public static final mr9 b;
    public final ym5 a;

    static {
        v39 v39Var = new v39((byte) 6);
        v39Var.b = ym5.p(2, 1, 5);
        b = new mr9(v39Var);
    }

    public mr9(v39 v39Var) {
        this.a = (ym5) v39Var.b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mr9) && this.a.equals(((mr9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
