package ca;

import java.util.Map;
public final class c {
    public final String f5110a;
    public final long f5111b;
    public final Map f5112c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f5110a = str;
        this.f5111b = j3;
        this.f5112c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f5110a, cVar.f5110a) && this.f5111b == cVar.f5111b && kotlin.jvm.internal.j.a(this.f5112c, cVar.f5112c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5111b;
        return this.f5112c.hashCode() + (((this.f5110a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f5110a + ", timestamp=" + this.f5111b + ", additionalCustomKeys=" + this.f5112c + ')';
    }
}
