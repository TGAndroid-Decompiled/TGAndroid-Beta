package i2;

import j$.util.Objects;
public final class v0 {
    public final long f12598a;
    public final float f12599b;
    public final long f12600c;

    public v0(u0 u0Var) {
        this.f12598a = u0Var.f12593a;
        this.f12599b = u0Var.f12594b;
        this.f12600c = u0Var.f12595c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f12598a == v0Var.f12598a && this.f12599b == v0Var.f12599b && this.f12600c == v0Var.f12600c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12598a), Float.valueOf(this.f12599b), Long.valueOf(this.f12600c));
    }
}
