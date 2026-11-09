package di;

import j$.util.Objects;
public final class n extends rg.a {
    public final long f9366c;

    public n(long j3) {
        super(0, false);
        this.f9366c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f9366c == ((n) obj).f9366c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9366c));
    }
}
