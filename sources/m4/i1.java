package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class i1 {
    public static final String f14572b;
    public final e9.m0 f14573a;

    static {
        new i1(new HashSet());
        String str = e2.d0.f7871a;
        f14572b = Integer.toString(0, 36);
    }

    public i1(HashSet hashSet) {
        this.f14573a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        return this.f14573a.equals(((i1) obj).f14573a);
    }

    public final int hashCode() {
        return Objects.hash(this.f14573a);
    }
}
