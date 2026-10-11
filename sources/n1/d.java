package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16517a;

    public d(String str) {
        this.f16517a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16517a, ((d) obj).f16517a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16517a.hashCode();
    }

    public final String toString() {
        return this.f16517a;
    }
}
