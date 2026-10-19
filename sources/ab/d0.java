package ab;
public final class d0 {
    public final String f386a;
    public final String f387b;
    public final int f388c;
    public final long d;

    public d0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f386a = sessionId;
        this.f387b = firstSessionId;
        this.f388c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f386a, d0Var.f386a) && kotlin.jvm.internal.i.a(this.f387b, d0Var.f387b) && this.f388c == d0Var.f388c && this.d == d0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((a1.g.g(this.f386a.hashCode() * 31, 31, this.f387b) + this.f388c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f386a + ", firstSessionId=" + this.f387b + ", sessionIndex=" + this.f388c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
