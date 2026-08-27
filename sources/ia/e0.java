package ia;

public final class e0 {

    public final String f11000a;

    public final String f11001b;

    public final int f11002c;
    public final long d;

    public e0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f11000a = sessionId;
        this.f11001b = firstSessionId;
        this.f11002c = i10;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.j.a(this.f11000a, e0Var.f11000a) && kotlin.jvm.internal.j.a(this.f11001b, e0Var.f11001b) && this.f11002c == e0Var.f11002c && this.d == e0Var.d;
    }

    public final int hashCode() {
        int iG = (i0.a.g(this.f11000a.hashCode() * 31, 31, this.f11001b) + this.f11002c) * 31;
        long j10 = this.d;
        return iG + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f11000a + ", firstSessionId=" + this.f11001b + ", sessionIndex=" + this.f11002c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
