package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16495a;

    public d(String str) {
        this.f16495a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16495a, ((d) obj).f16495a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16495a.hashCode();
    }

    public final String toString() {
        return this.f16495a;
    }
}
