package defpackage;
public final class oe8 {
    public final lk4 a;

    public oe8(lk4 lk4Var) {
        this.a = lk4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe8)) {
            return false;
        }
        return this.a.equals(((oe8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
