package l2;

import j$.util.Objects;
public final class v0 {
    public final long f18064a;
    public final float f18065b;
    public final long f18066c;

    public v0(u0 u0Var) {
        this.f18064a = u0Var.f18055a;
        this.f18065b = u0Var.f18056b;
        this.f18066c = u0Var.f18057c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f18064a == v0Var.f18064a && this.f18065b == v0Var.f18065b && this.f18066c == v0Var.f18066c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f18064a), Float.valueOf(this.f18065b), Long.valueOf(this.f18066c));
    }
}
