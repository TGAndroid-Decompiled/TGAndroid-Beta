package ab;
public final class n0 {
    public final String f445a;
    public final String f446b;
    public final int f447c;
    public final long d;
    public final j e;
    public final String f448f;

    public n0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f445a = sessionId;
        this.f446b = firstSessionId;
        this.f447c = i10;
        this.d = j10;
        this.e = jVar;
        this.f448f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.i.a(this.f445a, n0Var.f445a) && kotlin.jvm.internal.i.a(this.f446b, n0Var.f446b) && this.f447c == n0Var.f447c && this.d == n0Var.d && kotlin.jvm.internal.i.a(this.e, n0Var.e) && kotlin.jvm.internal.i.a(this.f448f, n0Var.f448f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.e.hashCode();
        return this.f448f.hashCode() + ((hashCode + ((((a1.g.g(this.f445a.hashCode() * 31, 31, this.f446b) + this.f447c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f445a + ", firstSessionId=" + this.f446b + ", sessionIndex=" + this.f447c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f448f + ')';
    }
}
