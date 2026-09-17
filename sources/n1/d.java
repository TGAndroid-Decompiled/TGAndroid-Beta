package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f16380a;

    public d(String str) {
        this.f16380a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f16380a, ((d) obj).f16380a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16380a.hashCode();
    }

    public final String toString() {
        return this.f16380a;
    }
}
