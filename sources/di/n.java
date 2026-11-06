package di;

import j$.util.Objects;
public final class n extends rg.a {
    public final long f9375c;

    public n(long j3) {
        super(0, false);
        this.f9375c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f9375c == ((n) obj).f9375c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9375c));
    }
}
