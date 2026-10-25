package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f18578a;

    public d(String str) {
        this.f18578a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f18578a, ((d) obj).f18578a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18578a.hashCode();
    }

    public final String toString() {
        return this.f18578a;
    }
}
