package l2;

import j$.util.Objects;
public final class v0 {
    public final long f18065a;
    public final float f18066b;
    public final long f18067c;

    public v0(u0 u0Var) {
        this.f18065a = u0Var.f18056a;
        this.f18066b = u0Var.f18057b;
        this.f18067c = u0Var.f18058c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f18065a == v0Var.f18065a && this.f18066b == v0Var.f18066b && this.f18067c == v0Var.f18067c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f18065a), Float.valueOf(this.f18066b), Long.valueOf(this.f18067c));
    }
}
