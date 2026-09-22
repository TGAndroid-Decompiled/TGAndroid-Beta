package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f14858a;

    public d(String str) {
        this.f14858a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f14858a, ((d) obj).f14858a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14858a.hashCode();
    }

    public final String toString() {
        return this.f14858a;
    }
}
