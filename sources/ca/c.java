package ca;

import java.util.Map;
public final class c {
    public final String f6001a;
    public final long f6002b;
    public final Map f6003c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f6001a = str;
        this.f6002b = j3;
        this.f6003c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f6001a, cVar.f6001a) && this.f6002b == cVar.f6002b && kotlin.jvm.internal.j.a(this.f6003c, cVar.f6003c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f6002b;
        return this.f6003c.hashCode() + (((this.f6001a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f6001a + ", timestamp=" + this.f6002b + ", additionalCustomKeys=" + this.f6003c + ')';
    }
}
