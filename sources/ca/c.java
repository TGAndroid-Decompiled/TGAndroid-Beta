package ca;

import java.util.Map;
public final class c {
    public final String f4831a;
    public final long f4832b;
    public final Map f4833c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.f4831a = str;
        this.f4832b = j3;
        this.f4833c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f4831a, cVar.f4831a) && this.f4832b == cVar.f4832b && kotlin.jvm.internal.j.a(this.f4833c, cVar.f4833c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4832b;
        return this.f4833c.hashCode() + (((this.f4831a.hashCode() * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f4831a + ", timestamp=" + this.f4832b + ", additionalCustomKeys=" + this.f4833c + ')';
    }
}
