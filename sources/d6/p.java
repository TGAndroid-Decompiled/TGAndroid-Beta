package d6;

import java.util.Arrays;
public final class p {
    public final long f8117a;

    public p(long j10) {
        this.f8117a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f8117a == ((p) obj).f8117a && o6.l.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8117a), 0, Boolean.FALSE, null});
    }
}
