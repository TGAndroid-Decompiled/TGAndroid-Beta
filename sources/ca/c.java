package ca;

import java.util.Map;
public final class c {
    public final String f5142a;
    public final long f5143b;
    public final Map f5144c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f5142a = str;
        this.f5143b = j3;
        this.f5144c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f5142a, cVar.f5142a) && this.f5143b == cVar.f5143b && kotlin.jvm.internal.j.a(this.f5144c, cVar.f5144c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5143b;
        return this.f5144c.hashCode() + (((this.f5142a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f5142a + ", timestamp=" + this.f5143b + ", additionalCustomKeys=" + this.f5144c + ')';
    }
}
