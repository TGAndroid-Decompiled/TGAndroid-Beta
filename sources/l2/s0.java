package l2;

import j$.util.Objects;
public final class s0 {
    public final long f19544a;
    public final float f19545b;
    public final long f19546c;

    public s0(r0 r0Var) {
        this.f19544a = r0Var.f19539a;
        this.f19545b = r0Var.f19540b;
        this.f19546c = r0Var.f19541c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f19544a == s0Var.f19544a && this.f19545b == s0Var.f19545b && this.f19546c == s0Var.f19546c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19544a), Float.valueOf(this.f19545b), Long.valueOf(this.f19546c));
    }
}
