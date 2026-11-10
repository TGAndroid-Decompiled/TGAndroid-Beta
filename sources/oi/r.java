package oi;

import j$.util.Objects;
public final class r {
    public final boolean f21127a;
    public final boolean f21128b;

    public r(boolean z9, boolean z10) {
        this.f21127a = z9;
        this.f21128b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f21127a == rVar.f21127a && this.f21128b == rVar.f21128b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f21127a), Boolean.valueOf(this.f21128b));
    }
}
