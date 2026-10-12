package c6;

import java.util.Arrays;
public final class p {
    public final long f4518a;

    public p(long j10) {
        this.f4518a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f4518a == ((p) obj).f4518a && n6.l.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4518a), 0, Boolean.FALSE, null});
    }
}
