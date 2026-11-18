package ca;

import java.util.Map;
public final class c {
    public final String f5113a;
    public final long f5114b;
    public final Map f5115c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f5113a = str;
        this.f5114b = j3;
        this.f5115c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f5113a, cVar.f5113a) && this.f5114b == cVar.f5114b && kotlin.jvm.internal.j.a(this.f5115c, cVar.f5115c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5114b;
        return this.f5115c.hashCode() + (((this.f5113a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f5113a + ", timestamp=" + this.f5114b + ", additionalCustomKeys=" + this.f5115c + ')';
    }
}
