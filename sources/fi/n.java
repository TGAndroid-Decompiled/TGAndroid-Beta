package fi;

import j$.util.Objects;
public final class n extends rg.a {
    public final long f12320c;

    public n(long j3) {
        super(0, false);
        this.f12320c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f12320c == ((n) obj).f12320c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12320c));
    }
}
