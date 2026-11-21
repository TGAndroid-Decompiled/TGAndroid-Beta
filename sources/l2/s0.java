package l2;

import j$.util.Objects;
public final class s0 {
    public final long f19569a;
    public final float f19570b;
    public final long f19571c;

    public s0(r0 r0Var) {
        this.f19569a = r0Var.f19564a;
        this.f19570b = r0Var.f19565b;
        this.f19571c = r0Var.f19566c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f19569a == s0Var.f19569a && this.f19570b == s0Var.f19570b && this.f19571c == s0Var.f19571c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19569a), Float.valueOf(this.f19570b), Long.valueOf(this.f19571c));
    }
}
