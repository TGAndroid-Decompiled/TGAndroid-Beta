package i2;

import j$.util.Objects;
public final class u0 {
    public final long f12625a;
    public final float f12626b;
    public final long f12627c;

    public u0(t0 t0Var) {
        this.f12625a = t0Var.f12617a;
        this.f12626b = t0Var.f12618b;
        this.f12627c = t0Var.f12619c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f12625a == u0Var.f12625a && this.f12626b == u0Var.f12626b && this.f12627c == u0Var.f12627c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12625a), Float.valueOf(this.f12626b), Long.valueOf(this.f12627c));
    }
}
