package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16471a;

    public d(String str) {
        this.f16471a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16471a, ((d) obj).f16471a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16471a.hashCode();
    }

    public final String toString() {
        return this.f16471a;
    }
}
