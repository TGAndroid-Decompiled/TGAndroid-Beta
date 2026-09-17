package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16353a;

    public d(String str) {
        this.f16353a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16353a, ((d) obj).f16353a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16353a.hashCode();
    }

    public final String toString() {
        return this.f16353a;
    }
}
