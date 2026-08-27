package n1;

import kotlin.jvm.internal.j;

public final class e {

    public final String f18089a;

    public e(String str) {
        this.f18089a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return j.a(this.f18089a, ((e) obj).f18089a);
    }

    public final int hashCode() {
        return this.f18089a.hashCode();
    }

    public final String toString() {
        return this.f18089a;
    }
}
