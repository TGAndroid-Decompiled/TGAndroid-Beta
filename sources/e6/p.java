package e6;

import java.util.Arrays;
public final class p {
    public final long f9751a;

    public p(long j10) {
        this.f9751a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f9751a == ((p) obj).f9751a && p6.m.k(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9751a), 0, Boolean.FALSE, null});
    }
}
