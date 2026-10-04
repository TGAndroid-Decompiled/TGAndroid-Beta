package li;

import j$.util.Objects;
public final class n {
    public final boolean f15684a;
    public final boolean f15685b;

    public n(boolean z10, boolean z11) {
        this.f15684a = z10;
        this.f15685b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f15684a == nVar.f15684a && this.f15685b == nVar.f15685b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f15684a), Boolean.valueOf(this.f15685b));
    }
}
