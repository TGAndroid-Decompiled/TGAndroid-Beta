package bi;

import j$.util.Objects;
public final class r extends pg.a {
    public final long f3602c;

    public r(long j10) {
        super(0, false);
        this.f3602c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && this.f3602c == ((r) obj).f3602c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f3602c));
    }
}
