package i2;

import j$.util.Objects;
public final class r0 {
    public final long f10866a;
    public final float f10867b;
    public final long f10868c;

    public r0(q0 q0Var) {
        this.f10866a = q0Var.f10860a;
        this.f10867b = q0Var.f10861b;
        this.f10868c = q0Var.f10862c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f10866a == r0Var.f10866a && this.f10867b == r0Var.f10867b && this.f10868c == r0Var.f10868c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10866a), Float.valueOf(this.f10867b), Long.valueOf(this.f10868c));
    }
}
