package l2;

import j$.util.Objects;
public final class s0 {
    public final long f19541a;
    public final float f19542b;
    public final long f19543c;

    public s0(r0 r0Var) {
        this.f19541a = r0Var.f19536a;
        this.f19542b = r0Var.f19537b;
        this.f19543c = r0Var.f19538c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f19541a == s0Var.f19541a && this.f19542b == s0Var.f19542b && this.f19543c == s0Var.f19543c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19541a), Float.valueOf(this.f19542b), Long.valueOf(this.f19543c));
    }
}
