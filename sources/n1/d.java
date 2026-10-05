package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16504a;

    public d(String str) {
        this.f16504a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16504a, ((d) obj).f16504a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16504a.hashCode();
    }

    public final String toString() {
        return this.f16504a;
    }
}
