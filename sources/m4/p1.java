package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class p1 {
    public static final String f16678b;
    public final e9.y0 f16679a;

    static {
        new p1(new HashSet());
        String str = e2.m0.f8255a;
        f16678b = Integer.toString(0, 36);
    }

    public p1(HashSet hashSet) {
        this.f16679a = e9.y0.u(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        return this.f16679a.equals(((p1) obj).f16679a);
    }

    public final int hashCode() {
        return Objects.hash(this.f16679a);
    }
}
