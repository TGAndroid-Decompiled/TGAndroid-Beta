package nh;

import j$.util.Objects;
public final class n extends bg.b {
    public final long f15651c;

    public n(long j10) {
        super(0, false);
        this.f15651c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f15651c == ((n) obj).f15651c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f15651c));
    }
}
