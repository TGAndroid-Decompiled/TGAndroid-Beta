package l2;

import j$.util.Objects;
public final class s0 {
    public final long f19572a;
    public final float f19573b;
    public final long f19574c;

    public s0(r0 r0Var) {
        this.f19572a = r0Var.f19567a;
        this.f19573b = r0Var.f19568b;
        this.f19574c = r0Var.f19569c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f19572a == s0Var.f19572a && this.f19573b == s0Var.f19573b && this.f19574c == s0Var.f19574c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19572a), Float.valueOf(this.f19573b), Long.valueOf(this.f19574c));
    }
}
