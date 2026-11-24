package defpackage;

import j$.util.Objects;
public final class sa6 {
    public final long a;
    public final float b;
    public final long c;

    public sa6(ra6 ra6Var) {
        this.a = ra6Var.a;
        this.b = ra6Var.b;
        this.c = ra6Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa6)) {
            return false;
        }
        sa6 sa6Var = (sa6) obj;
        if (this.a == sa6Var.a && this.b == sa6Var.b && this.c == sa6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
