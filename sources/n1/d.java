package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f14835a;

    public d(String str) {
        this.f14835a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f14835a, ((d) obj).f14835a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14835a.hashCode();
    }

    public final String toString() {
        return this.f14835a;
    }
}
