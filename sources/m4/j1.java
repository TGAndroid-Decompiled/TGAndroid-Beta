package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class j1 {
    public static final String f15866b;
    public final e9.m0 f15867a;

    static {
        new j1(new HashSet());
        String str = e2.d0.f8529a;
        f15866b = Integer.toString(0, 36);
    }

    public j1(HashSet hashSet) {
        this.f15867a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        return this.f15867a.equals(((j1) obj).f15867a);
    }

    public final int hashCode() {
        return Objects.hash(this.f15867a);
    }
}
