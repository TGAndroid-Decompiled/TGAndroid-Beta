package l2;

import j$.util.Objects;
public final class v0 {
    public final long f18068a;
    public final float f18069b;
    public final long f18070c;

    public v0(u0 u0Var) {
        this.f18068a = u0Var.f18059a;
        this.f18069b = u0Var.f18060b;
        this.f18070c = u0Var.f18061c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f18068a == v0Var.f18068a && this.f18069b == v0Var.f18069b && this.f18070c == v0Var.f18070c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f18068a), Float.valueOf(this.f18069b), Long.valueOf(this.f18070c));
    }
}
