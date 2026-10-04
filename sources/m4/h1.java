package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class h1 {
    public static final String f16180b;
    public final e9.m0 f16181a;

    static {
        new h1(new HashSet());
        String str = e2.d0.f8538a;
        f16180b = Integer.toString(0, 36);
    }

    public h1(HashSet hashSet) {
        this.f16181a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        return this.f16181a.equals(((h1) obj).f16181a);
    }

    public final int hashCode() {
        return Objects.hash(this.f16181a);
    }
}
