package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f13415a;

    public d(String str) {
        this.f13415a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f13415a, ((d) obj).f13415a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13415a.hashCode();
    }

    public final String toString() {
        return this.f13415a;
    }
}
