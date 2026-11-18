package fi;

import j$.util.Objects;
public final class n extends rg.a {
    public final long f12282c;

    public n(long j3) {
        super(0, false);
        this.f12282c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f12282c == ((n) obj).f12282c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12282c));
    }
}
