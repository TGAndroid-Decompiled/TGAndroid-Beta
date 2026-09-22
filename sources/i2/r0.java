package i2;

import j$.util.Objects;
public final class r0 {
    public final long f10868a;
    public final float f10869b;
    public final long f10870c;

    public r0(q0 q0Var) {
        this.f10868a = q0Var.f10862a;
        this.f10869b = q0Var.f10863b;
        this.f10870c = q0Var.f10864c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f10868a == r0Var.f10868a && this.f10869b == r0Var.f10869b && this.f10870c == r0Var.f10870c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10868a), Float.valueOf(this.f10869b), Long.valueOf(this.f10870c));
    }
}
