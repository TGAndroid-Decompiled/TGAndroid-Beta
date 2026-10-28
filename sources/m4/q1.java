package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class q1 {
    public static final String f18204b;
    public final f9.t0 f18205a;

    static {
        new q1(new HashSet());
        String str = e2.n0.f9691a;
        f18204b = Integer.toString(0, 36);
    }

    public q1(HashSet hashSet) {
        this.f18205a = f9.t0.u(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        return this.f18205a.equals(((q1) obj).f18205a);
    }

    public final int hashCode() {
        return Objects.hash(this.f18205a);
    }
}
