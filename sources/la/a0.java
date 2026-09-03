package la;
public final class a0 {
    public final String f11843a;
    public final String f11844b;
    public final int f11845c;
    public final long d;

    public a0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f11843a = sessionId;
        this.f11844b = firstSessionId;
        this.f11845c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f11843a, a0Var.f11843a) && kotlin.jvm.internal.j.a(this.f11844b, a0Var.f11844b) && this.f11845c == a0Var.f11845c && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((kf.k0.e(this.f11843a.hashCode() * 31, 31, this.f11844b) + this.f11845c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f11843a + ", firstSessionId=" + this.f11844b + ", sessionIndex=" + this.f11845c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
