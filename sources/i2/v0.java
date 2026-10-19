package i2;

import j$.util.Objects;
public final class v0 {
    public final long f12596a;
    public final float f12597b;
    public final long f12598c;

    public v0(u0 u0Var) {
        this.f12596a = u0Var.f12591a;
        this.f12597b = u0Var.f12592b;
        this.f12598c = u0Var.f12593c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f12596a == v0Var.f12596a && this.f12597b == v0Var.f12597b && this.f12598c == v0Var.f12598c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12596a), Float.valueOf(this.f12597b), Long.valueOf(this.f12598c));
    }
}
