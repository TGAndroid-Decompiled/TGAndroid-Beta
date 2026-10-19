package c6;

import java.util.Arrays;
public final class p {
    public final long f4889a;

    public p(long j10) {
        this.f4889a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f4889a == ((p) obj).f4889a && n6.l.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4889a), 0, Boolean.FALSE, null});
    }
}
