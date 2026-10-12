package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16220a;

    public d(String str) {
        this.f16220a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16220a, ((d) obj).f16220a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16220a.hashCode();
    }

    public final String toString() {
        return this.f16220a;
    }
}
