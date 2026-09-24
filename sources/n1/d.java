package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f15071a;

    public d(String str) {
        this.f15071a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f15071a, ((d) obj).f15071a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15071a.hashCode();
    }

    public final String toString() {
        return this.f15071a;
    }
}
