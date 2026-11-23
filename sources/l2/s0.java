package l2;

import j$.util.Objects;
public final class s0 {
    public final long f19538a;
    public final float f19539b;
    public final long f19540c;

    public s0(r0 r0Var) {
        this.f19538a = r0Var.f19533a;
        this.f19539b = r0Var.f19534b;
        this.f19540c = r0Var.f19535c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f19538a == s0Var.f19538a && this.f19539b == s0Var.f19539b && this.f19540c == s0Var.f19540c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19538a), Float.valueOf(this.f19539b), Long.valueOf(this.f19540c));
    }
}
