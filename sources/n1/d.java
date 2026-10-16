package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15627a;

    public d(String str) {
        this.f15627a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15627a, ((d) obj).f15627a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15627a.hashCode();
    }

    public final String toString() {
        return this.f15627a;
    }
}
