package ab;
public final class n0 {
    public final String f446a;
    public final String f447b;
    public final int f448c;
    public final long d;
    public final j e;
    public final String f449f;

    public n0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f446a = sessionId;
        this.f447b = firstSessionId;
        this.f448c = i10;
        this.d = j10;
        this.e = jVar;
        this.f449f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.i.a(this.f446a, n0Var.f446a) && kotlin.jvm.internal.i.a(this.f447b, n0Var.f447b) && this.f448c == n0Var.f448c && this.d == n0Var.d && kotlin.jvm.internal.i.a(this.e, n0Var.e) && kotlin.jvm.internal.i.a(this.f449f, n0Var.f449f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.e.hashCode();
        return this.f449f.hashCode() + ((hashCode + ((((a1.g.g(this.f446a.hashCode() * 31, 31, this.f447b) + this.f448c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f446a + ", firstSessionId=" + this.f447b + ", sessionIndex=" + this.f448c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f449f + ')';
    }
}
