package defpackage;

import j$.util.Objects;
public final class t86 {
    public final long a;
    public final float b;
    public final long c;

    public t86(s86 s86Var) {
        this.a = s86Var.a;
        this.b = s86Var.b;
        this.c = s86Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t86)) {
            return false;
        }
        t86 t86Var = (t86) obj;
        if (this.a == t86Var.a && this.b == t86Var.b && this.c == t86Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
