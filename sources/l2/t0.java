package l2;

import j$.util.Objects;
public final class t0 {
    public final long f19642a;
    public final float f19643b;
    public final long f19644c;

    public t0(s0 s0Var) {
        this.f19642a = s0Var.f19637a;
        this.f19643b = s0Var.f19638b;
        this.f19644c = s0Var.f19639c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f19642a == t0Var.f19642a && this.f19643b == t0Var.f19643b && this.f19644c == t0Var.f19644c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19642a), Float.valueOf(this.f19643b), Long.valueOf(this.f19644c));
    }
}
