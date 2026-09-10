package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class o1 {
    public static final String f13465b;
    public final e9.m0 f13466a;

    static {
        new o1(new HashSet());
        String str = e2.d0.f7188a;
        f13465b = Integer.toString(0, 36);
    }

    public o1(HashSet hashSet) {
        this.f13466a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        return this.f13466a.equals(((o1) obj).f13466a);
    }

    public final int hashCode() {
        return Objects.hash(this.f13466a);
    }
}
