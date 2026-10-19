package ab;
public final class n0 {
    public final String f444a;
    public final String f445b;
    public final int f446c;
    public final long d;
    public final j e;
    public final String f447f;

    public n0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f444a = sessionId;
        this.f445b = firstSessionId;
        this.f446c = i10;
        this.d = j10;
        this.e = jVar;
        this.f447f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.i.a(this.f444a, n0Var.f444a) && kotlin.jvm.internal.i.a(this.f445b, n0Var.f445b) && this.f446c == n0Var.f446c && this.d == n0Var.d && kotlin.jvm.internal.i.a(this.e, n0Var.e) && kotlin.jvm.internal.i.a(this.f447f, n0Var.f447f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.e.hashCode();
        return this.f447f.hashCode() + ((hashCode + ((((a1.g.g(this.f444a.hashCode() * 31, 31, this.f445b) + this.f446c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f444a + ", firstSessionId=" + this.f445b + ", sessionIndex=" + this.f446c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f447f + ')';
    }
}
