package oi;

import j$.util.Objects;
public final class r {
    public final boolean f19504a;
    public final boolean f19505b;

    public r(boolean z10, boolean z11) {
        this.f19504a = z10;
        this.f19505b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f19504a == rVar.f19504a && this.f19505b == rVar.f19505b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f19504a), Boolean.valueOf(this.f19505b));
    }
}
