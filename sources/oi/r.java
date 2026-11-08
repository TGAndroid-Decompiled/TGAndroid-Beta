package oi;

import j$.util.Objects;
public final class r {
    public final boolean f21122a;
    public final boolean f21123b;

    public r(boolean z9, boolean z10) {
        this.f21122a = z9;
        this.f21123b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f21122a == rVar.f21122a && this.f21123b == rVar.f21123b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f21122a), Boolean.valueOf(this.f21123b));
    }
}
