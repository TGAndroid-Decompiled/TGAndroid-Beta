package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class m1 {
    public static final String f16031b;
    public final e9.m0 f16032a;

    static {
        new m1(new HashSet());
        String str = e2.d0.f8765a;
        f16031b = Integer.toString(0, 36);
    }

    public m1(HashSet hashSet) {
        this.f16032a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        return this.f16032a.equals(((m1) obj).f16032a);
    }

    public final int hashCode() {
        return Objects.hash(this.f16032a);
    }
}
