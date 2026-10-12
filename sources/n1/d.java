package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15913a;

    public d(String str) {
        this.f15913a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15913a, ((d) obj).f15913a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15913a.hashCode();
    }

    public final String toString() {
        return this.f15913a;
    }
}
