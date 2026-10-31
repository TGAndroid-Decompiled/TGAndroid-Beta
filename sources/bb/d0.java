package bb;
public final class d0 {
    public final String f2544a;
    public final String f2545b;
    public final int f2546c;
    public final long d;

    public d0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f2544a = sessionId;
        this.f2545b = firstSessionId;
        this.f2546c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f2544a, d0Var.f2544a) && kotlin.jvm.internal.i.a(this.f2545b, d0Var.f2545b) && this.f2546c == d0Var.f2546c && this.d == d0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((a1.g.f(this.f2544a.hashCode() * 31, 31, this.f2545b) + this.f2546c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f2544a + ", firstSessionId=" + this.f2545b + ", sessionIndex=" + this.f2546c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
