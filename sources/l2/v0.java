package l2;

import j$.util.Objects;
public final class v0 {
    public final long f18067a;
    public final float f18068b;
    public final long f18069c;

    public v0(u0 u0Var) {
        this.f18067a = u0Var.f18058a;
        this.f18068b = u0Var.f18059b;
        this.f18069c = u0Var.f18060c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f18067a == v0Var.f18067a && this.f18068b == v0Var.f18068b && this.f18069c == v0Var.f18069c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f18067a), Float.valueOf(this.f18068b), Long.valueOf(this.f18069c));
    }
}
