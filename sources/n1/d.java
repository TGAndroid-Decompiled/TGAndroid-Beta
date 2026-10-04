package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16499a;

    public d(String str) {
        this.f16499a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16499a, ((d) obj).f16499a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16499a.hashCode();
    }

    public final String toString() {
        return this.f16499a;
    }
}
