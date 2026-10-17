package i2;

import j$.util.Objects;
public final class t0 {
    public final long f12594a;
    public final float f12595b;
    public final long f12596c;

    public t0(s0 s0Var) {
        this.f12594a = s0Var.f12586a;
        this.f12595b = s0Var.f12587b;
        this.f12596c = s0Var.f12588c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f12594a == t0Var.f12594a && this.f12595b == t0Var.f12595b && this.f12596c == t0Var.f12596c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12594a), Float.valueOf(this.f12595b), Long.valueOf(this.f12596c));
    }
}
