package c6;

import java.util.Arrays;
public final class p {
    public final long f4025a;

    public p(long j3) {
        this.f4025a = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f4025a == ((p) obj).f4025a && n6.l.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4025a), 0, Boolean.FALSE, null});
    }
}
