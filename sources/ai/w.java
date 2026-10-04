package ai;

import j$.util.Objects;
public final class w extends og.a {
    public final long f1785c;

    public w(long j3) {
        super(0, false);
        this.f1785c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && this.f1785c == ((w) obj).f1785c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f1785c));
    }
}
