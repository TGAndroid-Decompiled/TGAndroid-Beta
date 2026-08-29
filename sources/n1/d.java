package n1;

import kotlin.jvm.internal.j;
public final class d {
    public final String f17088a;

    public d(String str) {
        this.f17088a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return j.a(this.f17088a, ((d) obj).f17088a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17088a.hashCode();
    }

    public final String toString() {
        return this.f17088a;
    }
}
