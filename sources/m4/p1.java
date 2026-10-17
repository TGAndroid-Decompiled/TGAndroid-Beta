package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class p1 {
    public static final String f16671b;
    public final e9.y0 f16672a;

    static {
        new p1(new HashSet());
        String str = e2.m0.f8254a;
        f16671b = Integer.toString(0, 36);
    }

    public p1(HashSet hashSet) {
        this.f16672a = e9.y0.u(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        return this.f16672a.equals(((p1) obj).f16672a);
    }

    public final int hashCode() {
        return Objects.hash(this.f16672a);
    }
}
