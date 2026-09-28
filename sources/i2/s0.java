package i2;

import j$.util.Objects;
public final class s0 {
    public final long f10863a;
    public final float f10864b;
    public final long f10865c;

    public s0(r0 r0Var) {
        this.f10863a = r0Var.f10854a;
        this.f10864b = r0Var.f10855b;
        this.f10865c = r0Var.f10856c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f10863a == s0Var.f10863a && this.f10864b == s0Var.f10864b && this.f10865c == s0Var.f10865c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10863a), Float.valueOf(this.f10864b), Long.valueOf(this.f10865c));
    }
}
