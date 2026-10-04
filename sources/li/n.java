package li;

import j$.util.Objects;
public final class n {
    public final boolean f15685a;
    public final boolean f15686b;

    public n(boolean z10, boolean z11) {
        this.f15685a = z10;
        this.f15686b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f15685a == nVar.f15685a && this.f15686b == nVar.f15686b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f15685a), Boolean.valueOf(this.f15686b));
    }
}
