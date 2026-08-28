package m5;

import java.util.Arrays;
public final class p {
    public final long f17452a;

    public p(long j10) {
        this.f17452a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f17452a == ((p) obj).f17452a && x5.l.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17452a), 0, Boolean.FALSE, null});
    }
}
