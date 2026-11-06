package ca;

import java.util.Map;
public final class c {
    public final String f6003a;
    public final long f6004b;
    public final Map f6005c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f6003a = str;
        this.f6004b = j3;
        this.f6005c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f6003a, cVar.f6003a) && this.f6004b == cVar.f6004b && kotlin.jvm.internal.j.a(this.f6005c, cVar.f6005c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f6004b;
        return this.f6005c.hashCode() + (((this.f6003a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f6003a + ", timestamp=" + this.f6004b + ", additionalCustomKeys=" + this.f6005c + ')';
    }
}
