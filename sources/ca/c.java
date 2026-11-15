package ca;

import java.util.Map;
public final class c {
    public final String f4828a;
    public final long f4829b;
    public final Map f4830c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f4828a = str;
        this.f4829b = j3;
        this.f4830c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f4828a, cVar.f4828a) && this.f4829b == cVar.f4829b && kotlin.jvm.internal.j.a(this.f4830c, cVar.f4830c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4829b;
        return this.f4830c.hashCode() + (((this.f4828a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f4828a + ", timestamp=" + this.f4829b + ", additionalCustomKeys=" + this.f4830c + ')';
    }
}
