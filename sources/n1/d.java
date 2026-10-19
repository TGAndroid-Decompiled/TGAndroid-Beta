package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f17009a;

    public d(String str) {
        this.f17009a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f17009a, ((d) obj).f17009a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17009a.hashCode();
    }

    public final String toString() {
        return this.f17009a;
    }
}
