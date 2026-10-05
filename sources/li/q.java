package li;

import j$.util.Objects;
public final class q {
    public final boolean f15694a;
    public final boolean f15695b;

    public q(boolean z10, boolean z11) {
        this.f15694a = z10;
        this.f15695b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15694a == qVar.f15694a && this.f15695b == qVar.f15695b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f15694a), Boolean.valueOf(this.f15695b));
    }
}
