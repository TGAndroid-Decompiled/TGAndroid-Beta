package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f18262a;

    public d(String str) {
        this.f18262a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f18262a, ((d) obj).f18262a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18262a.hashCode();
    }

    public final String toString() {
        return this.f18262a;
    }
}
