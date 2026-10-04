package i2;

import j$.util.Objects;
public final class s0 {
    public final long f11835a;
    public final float f11836b;
    public final long f11837c;

    public s0(r0 r0Var) {
        this.f11835a = r0Var.f11825a;
        this.f11836b = r0Var.f11826b;
        this.f11837c = r0Var.f11827c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f11835a == s0Var.f11835a && this.f11836b == s0Var.f11836b && this.f11837c == s0Var.f11837c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11835a), Float.valueOf(this.f11836b), Long.valueOf(this.f11837c));
    }
}
