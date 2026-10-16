package i2;

import j$.util.Objects;
public final class v0 {
    public final long f11210a;
    public final float f11211b;
    public final long f11212c;

    public v0(u0 u0Var) {
        this.f11210a = u0Var.f11202a;
        this.f11211b = u0Var.f11203b;
        this.f11212c = u0Var.f11204c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f11210a == v0Var.f11210a && this.f11211b == v0Var.f11211b && this.f11212c == v0Var.f11212c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11210a), Float.valueOf(this.f11211b), Long.valueOf(this.f11212c));
    }
}
