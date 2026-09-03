package n1;

import kotlin.jvm.internal.j;
public final class d {
    public final String f14201a;

    public d(String str) {
        this.f14201a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return j.a(this.f14201a, ((d) obj).f14201a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14201a.hashCode();
    }

    public final String toString() {
        return this.f14201a;
    }
}
