package li;

import j$.util.Objects;
public final class o {
    public final boolean f15689a;
    public final boolean f15690b;

    public o(boolean z10, boolean z11) {
        this.f15689a = z10;
        this.f15690b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f15689a == oVar.f15689a && this.f15690b == oVar.f15690b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f15689a), Boolean.valueOf(this.f15690b));
    }
}
