package ca;

import java.util.Map;
public final class c {
    public final String f5105a;
    public final long f5106b;
    public final Map f5107c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f5105a = str;
        this.f5106b = j3;
        this.f5107c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f5105a, cVar.f5105a) && this.f5106b == cVar.f5106b && kotlin.jvm.internal.j.a(this.f5107c, cVar.f5107c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5106b;
        return this.f5107c.hashCode() + (((this.f5105a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f5105a + ", timestamp=" + this.f5106b + ", additionalCustomKeys=" + this.f5107c + ')';
    }
}
