package ab;
public final class d0 {
    public final String f384a;
    public final String f385b;
    public final int f386c;
    public final long d;

    public d0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f384a = sessionId;
        this.f385b = firstSessionId;
        this.f386c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f384a, d0Var.f384a) && kotlin.jvm.internal.i.a(this.f385b, d0Var.f385b) && this.f386c == d0Var.f386c && this.d == d0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((a1.g.g(this.f384a.hashCode() * 31, 31, this.f385b) + this.f386c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f384a + ", firstSessionId=" + this.f385b + ", sessionIndex=" + this.f386c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
