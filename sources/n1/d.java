package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f13689a;

    public d(String str) {
        this.f13689a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f13689a, ((d) obj).f13689a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13689a.hashCode();
    }

    public final String toString() {
        return this.f13689a;
    }
}
