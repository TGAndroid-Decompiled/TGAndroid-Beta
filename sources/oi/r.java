package oi;

import j$.util.Objects;
public final class r {
    public final boolean f21119a;
    public final boolean f21120b;

    public r(boolean z9, boolean z10) {
        this.f21119a = z9;
        this.f21120b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f21119a == rVar.f21119a && this.f21120b == rVar.f21120b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f21119a), Boolean.valueOf(this.f21120b));
    }
}
