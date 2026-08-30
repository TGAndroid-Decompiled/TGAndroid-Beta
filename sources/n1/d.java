package n1;

import kotlin.jvm.internal.j;
public final class d {
    public final String f14213a;

    public d(String str) {
        this.f14213a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return j.a(this.f14213a, ((d) obj).f14213a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14213a.hashCode();
    }

    public final String toString() {
        return this.f14213a;
    }
}
