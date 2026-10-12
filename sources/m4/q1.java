package m4;

import j$.util.Objects;
import java.util.HashSet;
public final class q1 {
    public static final String f15589b;
    public final e9.y0 f15590a;

    static {
        new q1(new HashSet());
        String str = e2.m0.f8372a;
        f15589b = Integer.toString(0, 36);
    }

    public q1(HashSet hashSet) {
        this.f15590a = e9.y0.u(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        return this.f15590a.equals(((q1) obj).f15590a);
    }

    public final int hashCode() {
        return Objects.hash(this.f15590a);
    }
}
