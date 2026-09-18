package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15043a;

    public d(String str) {
        this.f15043a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15043a, ((d) obj).f15043a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15043a.hashCode();
    }

    public final String toString() {
        return this.f15043a;
    }
}
