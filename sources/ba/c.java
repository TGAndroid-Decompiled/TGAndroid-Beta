package ba;

import java.util.Map;
public final class c {
    public final String f3174a;
    public final long f3175b;
    public final Map f3176c;

    public c(String str, long j10, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f3174a = str;
        this.f3175b = j10;
        this.f3176c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f3174a, cVar.f3174a) && this.f3175b == cVar.f3175b && kotlin.jvm.internal.j.a(this.f3176c, cVar.f3176c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3175b;
        return this.f3176c.hashCode() + (((this.f3174a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f3174a + ", timestamp=" + this.f3175b + ", additionalCustomKeys=" + this.f3176c + ')';
    }
}
