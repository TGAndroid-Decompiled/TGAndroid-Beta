package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f14870a;

    public d(String str) {
        this.f14870a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f14870a, ((d) obj).f14870a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14870a.hashCode();
    }

    public final String toString() {
        return this.f14870a;
    }
}
