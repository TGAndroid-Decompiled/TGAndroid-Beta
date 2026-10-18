package i2;

import j$.util.Objects;
public final class u0 {
    public final long f12593a;
    public final float f12594b;
    public final long f12595c;

    public u0(t0 t0Var) {
        this.f12593a = t0Var.f12588a;
        this.f12594b = t0Var.f12589b;
        this.f12595c = t0Var.f12590c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f12593a == u0Var.f12593a && this.f12594b == u0Var.f12594b && this.f12595c == u0Var.f12595c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12593a), Float.valueOf(this.f12594b), Long.valueOf(this.f12595c));
    }
}
