package nh;

import j$.util.Objects;
public final class n extends bg.b {
    public final long f15631c;

    public n(long j10) {
        super(0, false);
        this.f15631c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f15631c == ((n) obj).f15631c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15631c));
    }
}
