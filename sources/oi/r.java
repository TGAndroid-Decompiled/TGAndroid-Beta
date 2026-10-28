package oi;

import j$.util.Objects;
public final class r {
    public final boolean f19503a;
    public final boolean f19504b;

    public r(boolean z10, boolean z11) {
        this.f19503a = z10;
        this.f19504b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f19503a == rVar.f19503a && this.f19504b == rVar.f19504b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f19503a), Boolean.valueOf(this.f19504b));
    }
}
