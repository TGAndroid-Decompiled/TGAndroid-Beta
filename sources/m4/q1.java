package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class q1 {
    public static final String f12902b;
    public final e9.y0 f12903a;

    static {
        new q1(new HashSet());
        String str = e2.l0.f6165a;
        f12902b = Integer.toString(0, 36);
    }

    public q1(HashSet hashSet) {
        this.f12903a = e9.y0.u(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        return this.f12903a.equals(((q1) obj).f12903a);
    }

    public final int hashCode() {
        return Objects.hash(this.f12903a);
    }
}
