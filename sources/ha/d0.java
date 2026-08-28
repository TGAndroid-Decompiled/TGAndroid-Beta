package ha;
public final class d0 {
    public final String f10286a;
    public final String f10287b;
    public final int f10288c;
    public final long d;

    public d0(int i9, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f10286a = sessionId;
        this.f10287b = firstSessionId;
        this.f10288c = i9;
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
        if (kotlin.jvm.internal.i.a(this.f10286a, d0Var.f10286a) && kotlin.jvm.internal.i.a(this.f10287b, d0Var.f10287b) && this.f10288c == d0Var.f10288c && this.d == d0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((j3.r0.f(this.f10286a.hashCode() * 31, 31, this.f10287b) + this.f10288c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f10286a + ", firstSessionId=" + this.f10287b + ", sessionIndex=" + this.f10288c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
