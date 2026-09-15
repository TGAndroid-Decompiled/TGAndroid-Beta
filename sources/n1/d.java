package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f14860a;

    public d(String str) {
        this.f14860a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f14860a, ((d) obj).f14860a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14860a.hashCode();
    }

    public final String toString() {
        return this.f14860a;
    }
}
