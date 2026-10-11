package i2;

import j$.util.Objects;
public final class s0 {
    public final long f11885a;
    public final float f11886b;
    public final long f11887c;

    public s0(r0 r0Var) {
        this.f11885a = r0Var.f11875a;
        this.f11886b = r0Var.f11876b;
        this.f11887c = r0Var.f11877c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f11885a == s0Var.f11885a && this.f11886b == s0Var.f11886b && this.f11887c == s0Var.f11887c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11885a), Float.valueOf(this.f11886b), Long.valueOf(this.f11887c));
    }
}
