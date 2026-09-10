package i2;

import j$.util.Objects;
public final class q0 {
    public final long f10347a;
    public final float f10348b;
    public final long f10349c;

    public q0(p0 p0Var) {
        this.f10347a = p0Var.f10340a;
        this.f10348b = p0Var.f10341b;
        this.f10349c = p0Var.f10342c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f10347a == q0Var.f10347a && this.f10348b == q0Var.f10348b && this.f10349c == q0Var.f10349c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10347a), Float.valueOf(this.f10348b), Long.valueOf(this.f10349c));
    }
}
