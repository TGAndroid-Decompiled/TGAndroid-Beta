package oh;

import j$.util.Objects;
public final class m extends cg.b {
    public final long f17422c;

    public m(long j10) {
        super(0, false);
        this.f17422c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f17422c == ((m) obj).f17422c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f17422c));
    }
}
