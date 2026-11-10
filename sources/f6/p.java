package f6;

import java.util.Arrays;
public final class p {
    public final long f11313a;

    public p(long j3) {
        this.f11313a = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f11313a == ((p) obj).f11313a && q6.m.k(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11313a), 0, Boolean.FALSE, null});
    }
}
