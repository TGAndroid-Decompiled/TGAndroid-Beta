package ih;

import j$.util.Objects;
public final class o extends wf.a {
    public final long f11875c;

    public o(long j10) {
        super(0, false);
        this.f11875c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && this.f11875c == ((o) obj).f11875c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11875c));
    }
}
