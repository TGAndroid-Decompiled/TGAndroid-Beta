package i2;

import j$.util.Objects;
public final class s0 {
    public final long f10866a;
    public final float f10867b;
    public final long f10868c;

    public s0(r0 r0Var) {
        this.f10866a = r0Var.f10857a;
        this.f10867b = r0Var.f10858b;
        this.f10868c = r0Var.f10859c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f10866a == s0Var.f10866a && this.f10867b == s0Var.f10867b && this.f10868c == s0Var.f10868c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10866a), Float.valueOf(this.f10867b), Long.valueOf(this.f10868c));
    }
}
