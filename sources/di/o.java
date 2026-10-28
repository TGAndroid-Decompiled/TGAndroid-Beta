package di;

import j$.util.Objects;
public final class o extends qg.a {
    public final long f8854c;

    public o(long j10) {
        super(0, false);
        this.f8854c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && this.f8854c == ((o) obj).f8854c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f8854c));
    }
}
