package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15082a;

    public d(String str) {
        this.f15082a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15082a, ((d) obj).f15082a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15082a.hashCode();
    }

    public final String toString() {
        return this.f15082a;
    }
}
