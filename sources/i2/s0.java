package i2;

import j$.util.Objects;
public final class s0 {
    public final long f11886a;
    public final float f11887b;
    public final long f11888c;

    public s0(r0 r0Var) {
        this.f11886a = r0Var.f11876a;
        this.f11887b = r0Var.f11877b;
        this.f11888c = r0Var.f11878c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f11886a == s0Var.f11886a && this.f11887b == s0Var.f11887b && this.f11888c == s0Var.f11888c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11886a), Float.valueOf(this.f11887b), Long.valueOf(this.f11888c));
    }
}
