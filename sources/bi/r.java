package bi;

import j$.util.Objects;
public final class r extends pg.a {
    public final long f3618c;

    public r(long j3) {
        super(0, false);
        this.f3618c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && this.f3618c == ((r) obj).f3618c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f3618c));
    }
}
