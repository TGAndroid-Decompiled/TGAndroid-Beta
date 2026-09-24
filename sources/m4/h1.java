package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class h1 {
    public static final String f14807b;
    public final e9.m0 f14808a;

    static {
        new h1(new HashSet());
        String str = e2.d0.f7870a;
        f14807b = Integer.toString(0, 36);
    }

    public h1(HashSet hashSet) {
        this.f14808a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        return this.f14808a.equals(((h1) obj).f14808a);
    }

    public final int hashCode() {
        return Objects.hash(this.f14808a);
    }
}
