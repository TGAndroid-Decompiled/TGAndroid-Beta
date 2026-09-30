package i2;

import j$.util.Objects;
public final class s0 {
    public final long f10877a;
    public final float f10878b;
    public final long f10879c;

    public s0(r0 r0Var) {
        this.f10877a = r0Var.f10868a;
        this.f10878b = r0Var.f10869b;
        this.f10879c = r0Var.f10870c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f10877a == s0Var.f10877a && this.f10878b == s0Var.f10878b && this.f10879c == s0Var.f10879c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10877a), Float.valueOf(this.f10878b), Long.valueOf(this.f10879c));
    }
}
