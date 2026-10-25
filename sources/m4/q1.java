package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class q1 {
    public static final String f18205b;
    public final f9.t0 f18206a;

    static {
        new q1(new HashSet());
        String str = e2.n0.f9692a;
        f18205b = Integer.toString(0, 36);
    }

    public q1(HashSet hashSet) {
        this.f18206a = f9.t0.u(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        return this.f18206a.equals(((q1) obj).f18206a);
    }

    public final int hashCode() {
        return Objects.hash(this.f18206a);
    }
}
