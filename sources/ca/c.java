package ca;

import java.util.Map;
public final class c {
    public final String f6006a;
    public final long f6007b;
    public final Map f6008c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f6006a = str;
        this.f6007b = j3;
        this.f6008c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f6006a, cVar.f6006a) && this.f6007b == cVar.f6007b && kotlin.jvm.internal.j.a(this.f6008c, cVar.f6008c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f6007b;
        return this.f6008c.hashCode() + (((this.f6006a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f6006a + ", timestamp=" + this.f6007b + ", additionalCustomKeys=" + this.f6008c + ')';
    }
}
