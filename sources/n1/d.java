package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16219a;

    public d(String str) {
        this.f16219a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16219a, ((d) obj).f16219a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16219a.hashCode();
    }

    public final String toString() {
        return this.f16219a;
    }
}
