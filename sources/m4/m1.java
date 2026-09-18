package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class m1 {
    public static final String f14802b;
    public final e9.m0 f14803a;

    static {
        new m1(new HashSet());
        String str = e2.d0.f7887a;
        f14802b = Integer.toString(0, 36);
    }

    public m1(HashSet hashSet) {
        this.f14803a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        return this.f14803a.equals(((m1) obj).f14803a);
    }

    public final int hashCode() {
        return Objects.hash(this.f14803a);
    }
}
