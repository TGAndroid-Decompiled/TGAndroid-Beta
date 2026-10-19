package ci;

import j$.util.Objects;
public final class o extends pg.a {
    public final long f5680c;

    public o(long j10) {
        super(0, false);
        this.f5680c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && this.f5680c == ((o) obj).f5680c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5680c));
    }
}
