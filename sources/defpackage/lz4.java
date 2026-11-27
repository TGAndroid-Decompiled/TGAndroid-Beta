package defpackage;

import j$.util.Objects;
public final class lz4 {
    public final boolean a;
    public final boolean b;

    public lz4(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz4)) {
            return false;
        }
        lz4 lz4Var = (lz4) obj;
        if (this.a == lz4Var.a && this.b == lz4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
