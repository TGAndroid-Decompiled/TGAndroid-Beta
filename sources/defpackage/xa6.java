package defpackage;

import j$.util.Objects;
public final class xa6 {
    public final long a;
    public final float b;
    public final long c;

    public xa6(wa6 wa6Var) {
        this.a = wa6Var.a;
        this.b = wa6Var.b;
        this.c = wa6Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa6)) {
            return false;
        }
        xa6 xa6Var = (xa6) obj;
        if (this.a == xa6Var.a && this.b == xa6Var.b && this.c == xa6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
