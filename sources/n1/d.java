package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f17007a;

    public d(String str) {
        this.f17007a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f17007a, ((d) obj).f17007a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17007a.hashCode();
    }

    public final String toString() {
        return this.f17007a;
    }
}
