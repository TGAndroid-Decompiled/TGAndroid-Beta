package la;
public final class k0 {
    public final String f12213a;
    public final String f12214b;
    public final int f12215c;
    public final long d;
    public final j f12216e;
    public final String f12217f;

    public k0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f12213a = sessionId;
        this.f12214b = firstSessionId;
        this.f12215c = i10;
        this.d = j10;
        this.f12216e = jVar;
        this.f12217f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.j.a(this.f12213a, k0Var.f12213a) && kotlin.jvm.internal.j.a(this.f12214b, k0Var.f12214b) && this.f12215c == k0Var.f12215c && this.d == k0Var.d && kotlin.jvm.internal.j.a(this.f12216e, k0Var.f12216e) && kotlin.jvm.internal.j.a(this.f12217f, k0Var.f12217f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.f12216e.hashCode();
        return this.f12217f.hashCode() + ((hashCode + ((((l.d.e(this.f12213a.hashCode() * 31, 31, this.f12214b) + this.f12215c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f12213a + ", firstSessionId=" + this.f12214b + ", sessionIndex=" + this.f12215c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f12216e + ", firebaseInstallationId=" + this.f12217f + ')';
    }
}
