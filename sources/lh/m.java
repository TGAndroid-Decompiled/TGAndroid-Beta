package lh;

import j$.util.Objects;
public final class m extends zf.a {
    public final long f15916c;

    public m(long j10) {
        super(0, false);
        this.f15916c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f15916c == ((m) obj).f15916c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15916c));
    }
}
