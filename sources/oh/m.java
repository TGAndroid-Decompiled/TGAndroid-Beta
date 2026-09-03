package oh;

import j$.util.Objects;
public final class m extends cg.b {
    public final long f17424c;

    public m(long j10) {
        super(0, false);
        this.f17424c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f17424c == ((m) obj).f17424c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f17424c));
    }
}
