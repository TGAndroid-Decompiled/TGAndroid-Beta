package i2;

import j$.util.Objects;
public final class r0 {
    public final long f10869a;
    public final float f10870b;
    public final long f10871c;

    public r0(q0 q0Var) {
        this.f10869a = q0Var.f10863a;
        this.f10870b = q0Var.f10864b;
        this.f10871c = q0Var.f10865c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f10869a == r0Var.f10869a && this.f10870b == r0Var.f10870b && this.f10871c == r0Var.f10871c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10869a), Float.valueOf(this.f10870b), Long.valueOf(this.f10871c));
    }
}
