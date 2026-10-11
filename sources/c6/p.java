package c6;

import java.util.Arrays;
public final class p {
    public final long f4405a;

    public p(long j3) {
        this.f4405a = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f4405a == ((p) obj).f4405a && n6.m.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4405a), 0, Boolean.FALSE, null});
    }
}
