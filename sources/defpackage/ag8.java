package defpackage;
public final class ag8 {
    public final lk4 a;

    public ag8(lk4 lk4Var) {
        this.a = lk4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag8)) {
            return false;
        }
        return this.a.equals(((ag8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
