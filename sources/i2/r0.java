package i2;

import j$.util.Objects;
public final class r0 {
    public final long f11727a;
    public final float f11728b;
    public final long f11729c;

    public r0(q0 q0Var) {
        this.f11727a = q0Var.f11719a;
        this.f11728b = q0Var.f11720b;
        this.f11729c = q0Var.f11721c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f11727a == r0Var.f11727a && this.f11728b == r0Var.f11728b && this.f11729c == r0Var.f11729c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11727a), Float.valueOf(this.f11728b), Long.valueOf(this.f11729c));
    }
}
