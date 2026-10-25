package bb;
public final class d0 {
    public final String f3744a;
    public final String f3745b;
    public final int f3746c;
    public final long d;

    public d0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f3744a = sessionId;
        this.f3745b = firstSessionId;
        this.f3746c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f3744a, d0Var.f3744a) && kotlin.jvm.internal.i.a(this.f3745b, d0Var.f3745b) && this.f3746c == d0Var.f3746c && this.d == d0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((a1.g.f(this.f3744a.hashCode() * 31, 31, this.f3745b) + this.f3746c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f3744a + ", firstSessionId=" + this.f3745b + ", sessionIndex=" + this.f3746c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
