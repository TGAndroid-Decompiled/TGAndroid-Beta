package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class j1 {
    public static final String f16182b;
    public final e9.m0 f16183a;

    static {
        new j1(new HashSet());
        String str = e2.d0.f8531a;
        f16182b = Integer.toString(0, 36);
    }

    public j1(HashSet hashSet) {
        this.f16183a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        return this.f16183a.equals(((j1) obj).f16183a);
    }

    public final int hashCode() {
        return Objects.hash(this.f16183a);
    }
}
