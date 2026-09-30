package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15087a;

    public d(String str) {
        this.f15087a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15087a, ((d) obj).f15087a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15087a.hashCode();
    }

    public final String toString() {
        return this.f15087a;
    }
}
