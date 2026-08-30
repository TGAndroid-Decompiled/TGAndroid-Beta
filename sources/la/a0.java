package la;

import kh.a2;
public final class a0 {
    public final String f11733a;
    public final String f11734b;
    public final int f11735c;
    public final long d;

    public a0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f11733a = sessionId;
        this.f11734b = firstSessionId;
        this.f11735c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f11733a, a0Var.f11733a) && kotlin.jvm.internal.j.a(this.f11734b, a0Var.f11734b) && this.f11735c == a0Var.f11735c && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((a2.e(this.f11733a.hashCode() * 31, 31, this.f11734b) + this.f11735c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f11733a + ", firstSessionId=" + this.f11734b + ", sessionIndex=" + this.f11735c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
