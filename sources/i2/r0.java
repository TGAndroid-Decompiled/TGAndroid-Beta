package i2;

import j$.util.Objects;
public final class r0 {
    public final long f11753a;
    public final float f11754b;
    public final long f11755c;

    public r0(q0 q0Var) {
        this.f11753a = q0Var.f11745a;
        this.f11754b = q0Var.f11746b;
        this.f11755c = q0Var.f11747c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f11753a == r0Var.f11753a && this.f11754b == r0Var.f11754b && this.f11755c == r0Var.f11755c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11753a), Float.valueOf(this.f11754b), Long.valueOf(this.f11755c));
    }
}
