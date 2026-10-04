package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16494a;

    public d(String str) {
        this.f16494a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16494a, ((d) obj).f16494a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16494a.hashCode();
    }

    public final String toString() {
        return this.f16494a;
    }
}
