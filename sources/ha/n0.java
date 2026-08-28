package ha;
public final class n0 {
    public final String f10350a;
    public final String f10351b;
    public final int f10352c;
    public final long d;
    public final j f10353e;
    public final String f10354f;

    public n0(String sessionId, String firstSessionId, int i9, long j10, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f10350a = sessionId;
        this.f10351b = firstSessionId;
        this.f10352c = i9;
        this.d = j10;
        this.f10353e = jVar;
        this.f10354f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.i.a(this.f10350a, n0Var.f10350a) && kotlin.jvm.internal.i.a(this.f10351b, n0Var.f10351b) && this.f10352c == n0Var.f10352c && this.d == n0Var.d && kotlin.jvm.internal.i.a(this.f10353e, n0Var.f10353e) && kotlin.jvm.internal.i.a(this.f10354f, n0Var.f10354f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.f10353e.hashCode();
        return this.f10354f.hashCode() + ((hashCode + ((((j3.r0.f(this.f10350a.hashCode() * 31, 31, this.f10351b) + this.f10352c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f10350a + ", firstSessionId=" + this.f10351b + ", sessionIndex=" + this.f10352c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f10353e + ", firebaseInstallationId=" + this.f10354f + ')';
    }
}
