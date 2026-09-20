package i2;

import j$.util.Objects;
public final class r0 {
    public final long f10870a;
    public final float f10871b;
    public final long f10872c;

    public r0(q0 q0Var) {
        this.f10870a = q0Var.f10864a;
        this.f10871b = q0Var.f10865b;
        this.f10872c = q0Var.f10866c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f10870a == r0Var.f10870a && this.f10871b == r0Var.f10871b && this.f10872c == r0Var.f10872c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10870a), Float.valueOf(this.f10871b), Long.valueOf(this.f10872c));
    }
}
