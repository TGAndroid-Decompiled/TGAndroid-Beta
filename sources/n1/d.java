package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f17003a;

    public d(String str) {
        this.f17003a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f17003a, ((d) obj).f17003a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17003a.hashCode();
    }

    public final String toString() {
        return this.f17003a;
    }
}
