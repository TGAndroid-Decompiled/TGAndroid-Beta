package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class n1 {
    public static final String f14636b;
    public final e9.m0 f14637a;

    static {
        new n1(new HashSet());
        String str = e2.d0.f7888a;
        f14636b = Integer.toString(0, 36);
    }

    public n1(HashSet hashSet) {
        this.f14637a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        return this.f14637a.equals(((n1) obj).f14637a);
    }

    public final int hashCode() {
        return Objects.hash(this.f14637a);
    }
}
