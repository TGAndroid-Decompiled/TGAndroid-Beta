package bb;
public final class n0 {
    public final String f2603a;
    public final String f2604b;
    public final int f2605c;
    public final long d;
    public final j e;
    public final String f2606f;

    public n0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f2603a = sessionId;
        this.f2604b = firstSessionId;
        this.f2605c = i10;
        this.d = j10;
        this.e = jVar;
        this.f2606f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.i.a(this.f2603a, n0Var.f2603a) && kotlin.jvm.internal.i.a(this.f2604b, n0Var.f2604b) && this.f2605c == n0Var.f2605c && this.d == n0Var.d && kotlin.jvm.internal.i.a(this.e, n0Var.e) && kotlin.jvm.internal.i.a(this.f2606f, n0Var.f2606f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.e.hashCode();
        return this.f2606f.hashCode() + ((hashCode + ((((a1.g.f(this.f2603a.hashCode() * 31, 31, this.f2604b) + this.f2605c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f2603a + ", firstSessionId=" + this.f2604b + ", sessionIndex=" + this.f2605c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f2606f + ')';
    }
}
