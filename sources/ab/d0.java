package ab;
public final class d0 {
    public final String f387a;
    public final String f388b;
    public final int f389c;
    public final long d;

    public d0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f387a = sessionId;
        this.f388b = firstSessionId;
        this.f389c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f387a, d0Var.f387a) && kotlin.jvm.internal.i.a(this.f388b, d0Var.f388b) && this.f389c == d0Var.f389c && this.d == d0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((a1.g.g(this.f387a.hashCode() * 31, 31, this.f388b) + this.f389c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f387a + ", firstSessionId=" + this.f388b + ", sessionIndex=" + this.f389c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
