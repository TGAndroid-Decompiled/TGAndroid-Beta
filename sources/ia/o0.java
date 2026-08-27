package ia;

public final class o0 {

    public final String f11062a;

    public final String f11063b;

    public final int f11064c;
    public final long d;

    public final j f11065e;

    public final String f11066f;

    public o0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f11062a = sessionId;
        this.f11063b = firstSessionId;
        this.f11064c = i10;
        this.d = j10;
        this.f11065e = jVar;
        this.f11066f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.j.a(this.f11062a, o0Var.f11062a) && kotlin.jvm.internal.j.a(this.f11063b, o0Var.f11063b) && this.f11064c == o0Var.f11064c && this.d == o0Var.d && kotlin.jvm.internal.j.a(this.f11065e, o0Var.f11065e) && kotlin.jvm.internal.j.a(this.f11066f, o0Var.f11066f);
    }

    public final int hashCode() {
        int iG = (i0.a.g(this.f11062a.hashCode() * 31, 31, this.f11063b) + this.f11064c) * 31;
        long j10 = this.d;
        return this.f11066f.hashCode() + ((this.f11065e.hashCode() + ((iG + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f11062a + ", firstSessionId=" + this.f11063b + ", sessionIndex=" + this.f11064c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f11065e + ", firebaseInstallationId=" + this.f11066f + ')';
    }
}
