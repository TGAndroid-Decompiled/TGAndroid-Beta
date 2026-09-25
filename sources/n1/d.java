package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15086a;

    public d(String str) {
        this.f15086a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15086a, ((d) obj).f15086a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15086a.hashCode();
    }

    public final String toString() {
        return this.f15086a;
    }
}
