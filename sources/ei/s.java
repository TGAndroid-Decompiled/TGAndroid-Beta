package ei;

import j$.util.Objects;
public final class s {
    public final boolean f6693a;
    public final boolean f6694b;

    public s(boolean z10, boolean z11) {
        this.f6693a = z10;
        this.f6694b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f6693a == sVar.f6693a && this.f6694b == sVar.f6694b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f6693a), Boolean.valueOf(this.f6694b));
    }
}
