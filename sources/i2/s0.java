package i2;

import j$.util.Objects;
public final class s0 {
    public final long f11836a;
    public final float f11837b;
    public final long f11838c;

    public s0(r0 r0Var) {
        this.f11836a = r0Var.f11826a;
        this.f11837b = r0Var.f11827b;
        this.f11838c = r0Var.f11828c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f11836a == s0Var.f11836a && this.f11837b == s0Var.f11837b && this.f11838c == s0Var.f11838c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11836a), Float.valueOf(this.f11837b), Long.valueOf(this.f11838c));
    }
}
