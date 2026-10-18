package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f17006a;

    public d(String str) {
        this.f17006a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f17006a, ((d) obj).f17006a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17006a.hashCode();
    }

    public final String toString() {
        return this.f17006a;
    }
}
