package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class n1 {
    public static final String f14626b;
    public final e9.m0 f14627a;

    static {
        new n1(new HashSet());
        String str = e2.d0.f7883a;
        f14626b = Integer.toString(0, 36);
    }

    public n1(HashSet hashSet) {
        this.f14627a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        return this.f14627a.equals(((n1) obj).f14627a);
    }

    public final int hashCode() {
        return Objects.hash(this.f14627a);
    }
}
