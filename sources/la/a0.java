package la;
public final class a0 {
    public final String f12141a;
    public final String f12142b;
    public final int f12143c;
    public final long d;

    public a0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f12141a = sessionId;
        this.f12142b = firstSessionId;
        this.f12143c = i10;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (kotlin.jvm.internal.j.a(this.f12141a, a0Var.f12141a) && kotlin.jvm.internal.j.a(this.f12142b, a0Var.f12142b) && this.f12143c == a0Var.f12143c && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((l.d.e(this.f12141a.hashCode() * 31, 31, this.f12142b) + this.f12143c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f12141a + ", firstSessionId=" + this.f12142b + ", sessionIndex=" + this.f12143c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
