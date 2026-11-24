package defpackage;

import j$.util.Objects;
public final class fx4 {
    public final boolean a;
    public final boolean b;

    public fx4(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx4)) {
            return false;
        }
        fx4 fx4Var = (fx4) obj;
        if (this.a == fx4Var.a && this.b == fx4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
