package ei;

import j$.util.Objects;
public final class o extends sg.a {
    public final long f10682c;

    public o(long j10) {
        super(0, false);
        this.f10682c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && this.f10682c == ((o) obj).f10682c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10682c));
    }
}
