package n1;

import kotlin.jvm.internal.j;
public final class d {
    public final String f15189a;

    public d(String str) {
        this.f15189a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return j.a(this.f15189a, ((d) obj).f15189a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15189a.hashCode();
    }

    public final String toString() {
        return this.f15189a;
    }
}
