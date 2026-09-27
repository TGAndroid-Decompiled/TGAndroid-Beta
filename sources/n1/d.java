package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15123a;

    public d(String str) {
        this.f15123a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15123a, ((d) obj).f15123a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15123a.hashCode();
    }

    public final String toString() {
        return this.f15123a;
    }
}
