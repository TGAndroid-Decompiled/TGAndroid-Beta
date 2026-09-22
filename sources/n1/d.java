package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15097a;

    public d(String str) {
        this.f15097a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15097a, ((d) obj).f15097a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15097a.hashCode();
    }

    public final String toString() {
        return this.f15097a;
    }
}
