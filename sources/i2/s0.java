package i2;

import j$.util.Objects;
public final class s0 {
    public final long f11884a;
    public final float f11885b;
    public final long f11886c;

    public s0(r0 r0Var) {
        this.f11884a = r0Var.f11874a;
        this.f11885b = r0Var.f11875b;
        this.f11886c = r0Var.f11876c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f11884a == s0Var.f11884a && this.f11885b == s0Var.f11885b && this.f11886c == s0Var.f11886c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11884a), Float.valueOf(this.f11885b), Long.valueOf(this.f11886c));
    }
}
