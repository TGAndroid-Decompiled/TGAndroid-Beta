package l2;

import j$.util.Objects;
public final class s0 {
    public final long f19177a;
    public final float f19178b;
    public final long f19179c;

    public s0(r0 r0Var) {
        this.f19177a = r0Var.f19172a;
        this.f19178b = r0Var.f19173b;
        this.f19179c = r0Var.f19174c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f19177a == s0Var.f19177a && this.f19178b == s0Var.f19178b && this.f19179c == s0Var.f19179c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19177a), Float.valueOf(this.f19178b), Long.valueOf(this.f19179c));
    }
}
