package fi;

import j$.util.Objects;
public final class n extends rg.a {
    public final long f12274c;

    public n(long j3) {
        super(0, false);
        this.f12274c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f12274c == ((n) obj).f12274c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12274c));
    }
}
