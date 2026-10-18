package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f17010a;

    public d(String str) {
        this.f17010a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f17010a, ((d) obj).f17010a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17010a.hashCode();
    }

    public final String toString() {
        return this.f17010a;
    }
}
