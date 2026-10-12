package ab;
public final class n0 {
    public final String f442a;
    public final String f443b;
    public final int f444c;
    public final long d;
    public final j e;
    public final String f445f;

    public n0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f442a = sessionId;
        this.f443b = firstSessionId;
        this.f444c = i10;
        this.d = j10;
        this.e = jVar;
        this.f445f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.i.a(this.f442a, n0Var.f442a) && kotlin.jvm.internal.i.a(this.f443b, n0Var.f443b) && this.f444c == n0Var.f444c && this.d == n0Var.d && kotlin.jvm.internal.i.a(this.e, n0Var.e) && kotlin.jvm.internal.i.a(this.f445f, n0Var.f445f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.e.hashCode();
        return this.f445f.hashCode() + ((hashCode + ((((a1.g.g(this.f442a.hashCode() * 31, 31, this.f443b) + this.f444c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f442a + ", firstSessionId=" + this.f443b + ", sessionIndex=" + this.f444c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f445f + ')';
    }
}
