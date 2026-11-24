package defpackage;
public final class lc8 {
    public final gi4 a;

    public lc8(gi4 gi4Var) {
        this.a = gi4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc8)) {
            return false;
        }
        return this.a.equals(((lc8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
