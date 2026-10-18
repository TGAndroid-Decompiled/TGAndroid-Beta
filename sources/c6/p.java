package c6;

import java.util.Arrays;
public final class p {
    public final long f4892a;

    public p(long j10) {
        this.f4892a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f4892a == ((p) obj).f4892a && n6.l.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4892a), 0, Boolean.FALSE, null});
    }
}
