package i2;

import j$.util.Objects;
public final class u0 {
    public final long f12595a;
    public final float f12596b;
    public final long f12597c;

    public u0(t0 t0Var) {
        this.f12595a = t0Var.f12590a;
        this.f12596b = t0Var.f12591b;
        this.f12597c = t0Var.f12592c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f12595a == u0Var.f12595a && this.f12596b == u0Var.f12596b && this.f12597c == u0Var.f12597c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12595a), Float.valueOf(this.f12596b), Long.valueOf(this.f12597c));
    }
}
