package o4;

import j$.util.Objects;
import java.util.HashSet;
public final class o1 {
    public static final String f20790b;
    public final g9.t0 f20791a;

    static {
        new o1(new HashSet());
        String str = g2.n0.f11873a;
        f20790b = Integer.toString(0, 36);
    }

    public o1(HashSet hashSet) {
        this.f20791a = g9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        return this.f20791a.equals(((o1) obj).f20791a);
    }

    public final int hashCode() {
        return Objects.hash(this.f20791a);
    }
}
