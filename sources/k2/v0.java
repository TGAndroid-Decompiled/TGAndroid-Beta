package k2;

import j$.util.Objects;
public final class v0 {
    public final long f16753a;
    public final float f16754b;
    public final long f16755c;

    public v0(u0 u0Var) {
        this.f16753a = u0Var.f16744a;
        this.f16754b = u0Var.f16745b;
        this.f16755c = u0Var.f16746c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f16753a == v0Var.f16753a && this.f16754b == v0Var.f16754b && this.f16755c == v0Var.f16755c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f16753a), Float.valueOf(this.f16754b), Long.valueOf(this.f16755c));
    }
}
