package ja;

import j7.l1;
public final class d0 {
    public final String f11321a;
    public final String f11322b;
    public final int f11323c;
    public final long d;

    public d0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f11321a = sessionId;
        this.f11322b = firstSessionId;
        this.f11323c = i10;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (kotlin.jvm.internal.j.a(this.f11321a, d0Var.f11321a) && kotlin.jvm.internal.j.a(this.f11322b, d0Var.f11322b) && this.f11323c == d0Var.f11323c && this.d == d0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((l1.f(this.f11321a.hashCode() * 31, 31, this.f11322b) + this.f11323c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f11321a + ", firstSessionId=" + this.f11322b + ", sessionIndex=" + this.f11323c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
