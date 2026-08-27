package jh;

import j$.util.Objects;

public final class m extends xf.a {

    public final long f13646c;

    public m(long j10) {
        super(0, false);
        this.f13646c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f13646c == ((m) obj).f13646c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13646c));
    }
}
