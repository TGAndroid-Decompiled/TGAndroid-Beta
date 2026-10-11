package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16553a;

    public d(String str) {
        this.f16553a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16553a, ((d) obj).f16553a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16553a.hashCode();
    }

    public final String toString() {
        return this.f16553a;
    }
}
