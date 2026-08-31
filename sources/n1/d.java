package n1;

import kotlin.jvm.internal.j;
public final class d {
    public final String f15187a;

    public d(String str) {
        this.f15187a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return j.a(this.f15187a, ((d) obj).f15187a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15187a.hashCode();
    }

    public final String toString() {
        return this.f15187a;
    }
}
