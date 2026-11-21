package ca;

import java.util.Map;
public final class c {
    public final String f5139a;
    public final long f5140b;
    public final Map f5141c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f5139a = str;
        this.f5140b = j3;
        this.f5141c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f5139a, cVar.f5139a) && this.f5140b == cVar.f5140b && kotlin.jvm.internal.j.a(this.f5141c, cVar.f5141c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5140b;
        return this.f5141c.hashCode() + (((this.f5139a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f5139a + ", timestamp=" + this.f5140b + ", additionalCustomKeys=" + this.f5141c + ')';
    }
}
