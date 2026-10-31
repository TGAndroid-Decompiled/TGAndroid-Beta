package c6;

import java.util.Arrays;
public final class p {
    public final long f3920a;

    public p(long j10) {
        this.f3920a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f3920a == ((p) obj).f3920a && n6.l.k(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3920a), 0, Boolean.FALSE, null});
    }
}
