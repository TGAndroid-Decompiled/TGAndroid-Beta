package bi;

import j$.util.Objects;
public final class r extends pg.a {
    public final long f3645c;

    public r(long j3) {
        super(0, false);
        this.f3645c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && this.f3645c == ((r) obj).f3645c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f3645c));
    }
}
