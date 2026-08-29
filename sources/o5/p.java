package o5;

import java.util.Arrays;
public final class p {
    public final long f19311a;

    public p(long j10) {
        this.f19311a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f19311a == ((p) obj).f19311a && z5.l.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19311a), 0, Boolean.FALSE, null});
    }
}
