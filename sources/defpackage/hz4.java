package defpackage;

import j$.util.Objects;
public final class hz4 {
    public final boolean a;
    public final boolean b;

    public hz4(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz4)) {
            return false;
        }
        hz4 hz4Var = (hz4) obj;
        if (this.a == hz4Var.a && this.b == hz4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
