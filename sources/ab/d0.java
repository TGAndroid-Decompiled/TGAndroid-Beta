package ab;
public final class d0 {
    public final String f388a;
    public final String f389b;
    public final int f390c;
    public final long d;

    public d0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f388a = sessionId;
        this.f389b = firstSessionId;
        this.f390c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f388a, d0Var.f388a) && kotlin.jvm.internal.i.a(this.f389b, d0Var.f389b) && this.f390c == d0Var.f390c && this.d == d0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((a1.g.g(this.f388a.hashCode() * 31, 31, this.f389b) + this.f390c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f388a + ", firstSessionId=" + this.f389b + ", sessionIndex=" + this.f390c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
