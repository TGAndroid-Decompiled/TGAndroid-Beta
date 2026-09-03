package la;
public final class k0 {
    public final String f11907a;
    public final String f11908b;
    public final int f11909c;
    public final long d;
    public final j e;
    public final String f11910f;

    public k0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f11907a = sessionId;
        this.f11908b = firstSessionId;
        this.f11909c = i10;
        this.d = j10;
        this.e = jVar;
        this.f11910f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.j.a(this.f11907a, k0Var.f11907a) && kotlin.jvm.internal.j.a(this.f11908b, k0Var.f11908b) && this.f11909c == k0Var.f11909c && this.d == k0Var.d && kotlin.jvm.internal.j.a(this.e, k0Var.e) && kotlin.jvm.internal.j.a(this.f11910f, k0Var.f11910f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.e.hashCode();
        return this.f11910f.hashCode() + ((hashCode + ((((kf.k0.e(this.f11907a.hashCode() * 31, 31, this.f11908b) + this.f11909c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f11907a + ", firstSessionId=" + this.f11908b + ", sessionIndex=" + this.f11909c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f11910f + ')';
    }
}
