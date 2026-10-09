package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class i1 {
    public static final String f16117b;
    public final e9.m0 f16118a;

    static {
        new i1(new HashSet());
        String str = e2.d0.f8532a;
        f16117b = Integer.toString(0, 36);
    }

    public i1(HashSet hashSet) {
        this.f16118a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        return this.f16118a.equals(((i1) obj).f16118a);
    }

    public final int hashCode() {
        return Objects.hash(this.f16118a);
    }
}
