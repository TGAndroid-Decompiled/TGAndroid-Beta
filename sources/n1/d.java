package n1;

import kotlin.jvm.internal.i;
public final class d {
    public final String f17070a;

    public d(String str) {
        this.f17070a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return i.a(this.f17070a, ((d) obj).f17070a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17070a.hashCode();
    }

    public final String toString() {
        return this.f17070a;
    }
}
