package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15102a;

    public d(String str) {
        this.f15102a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15102a, ((d) obj).f15102a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15102a.hashCode();
    }

    public final String toString() {
        return this.f15102a;
    }
}
