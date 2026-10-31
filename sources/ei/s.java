package ei;

import j$.util.Objects;
public final class s {
    public final boolean f6692a;
    public final boolean f6693b;

    public s(boolean z10, boolean z11) {
        this.f6692a = z10;
        this.f6693b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f6692a == sVar.f6692a && this.f6693b == sVar.f6693b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f6692a), Boolean.valueOf(this.f6693b));
    }
}
