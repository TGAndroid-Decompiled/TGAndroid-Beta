package bb;
public final class n0 {
    public final String f3802a;
    public final String f3803b;
    public final int f3804c;
    public final long d;
    public final j e;
    public final String f3805f;

    public n0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f3802a = sessionId;
        this.f3803b = firstSessionId;
        this.f3804c = i10;
        this.d = j10;
        this.e = jVar;
        this.f3805f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.i.a(this.f3802a, n0Var.f3802a) && kotlin.jvm.internal.i.a(this.f3803b, n0Var.f3803b) && this.f3804c == n0Var.f3804c && this.d == n0Var.d && kotlin.jvm.internal.i.a(this.e, n0Var.e) && kotlin.jvm.internal.i.a(this.f3805f, n0Var.f3805f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.e.hashCode();
        return this.f3805f.hashCode() + ((hashCode + ((((a1.g.f(this.f3802a.hashCode() * 31, 31, this.f3803b) + this.f3804c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f3802a + ", firstSessionId=" + this.f3803b + ", sessionIndex=" + this.f3804c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f3805f + ')';
    }
}
