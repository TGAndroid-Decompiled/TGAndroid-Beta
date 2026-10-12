package i2;

import j$.util.Objects;
public final class v0 {
    public final long f11206a;
    public final float f11207b;
    public final long f11208c;

    public v0(u0 u0Var) {
        this.f11206a = u0Var.f11198a;
        this.f11207b = u0Var.f11199b;
        this.f11208c = u0Var.f11200c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f11206a == v0Var.f11206a && this.f11207b == v0Var.f11207b && this.f11208c == v0Var.f11208c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11206a), Float.valueOf(this.f11207b), Long.valueOf(this.f11208c));
    }
}
