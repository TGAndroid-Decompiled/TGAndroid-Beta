package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f13414a;

    public d(String str) {
        this.f13414a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f13414a, ((d) obj).f13414a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13414a.hashCode();
    }

    public final String toString() {
        return this.f13414a;
    }
}
