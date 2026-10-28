package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f18577a;

    public d(String str) {
        this.f18577a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f18577a, ((d) obj).f18577a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18577a.hashCode();
    }

    public final String toString() {
        return this.f18577a;
    }
}
