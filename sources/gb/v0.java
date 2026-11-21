package gb;

import com.google.android.gms.internal.vision.e2;
public final class v0 {
    public final String f13450a;
    public final String f13451b;
    public final int f13452c;
    public final long d;
    public final k f13453e;
    public final String f13454f;
    public final String f13455g;

    public v0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13450a = sessionId;
        this.f13451b = firstSessionId;
        this.f13452c = i7;
        this.d = j3;
        this.f13453e = kVar;
        this.f13454f = str;
        this.f13455g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (kotlin.jvm.internal.j.a(this.f13450a, v0Var.f13450a) && kotlin.jvm.internal.j.a(this.f13451b, v0Var.f13451b) && this.f13452c == v0Var.f13452c && this.d == v0Var.d && kotlin.jvm.internal.j.a(this.f13453e, v0Var.f13453e) && kotlin.jvm.internal.j.a(this.f13454f, v0Var.f13454f) && kotlin.jvm.internal.j.a(this.f13455g, v0Var.f13455g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13455g.hashCode() + e2.h((this.f13453e.hashCode() + ((((e2.h(this.f13450a.hashCode() * 31, 31, this.f13451b) + this.f13452c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13454f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13450a + ", firstSessionId=" + this.f13451b + ", sessionIndex=" + this.f13452c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13453e + ", firebaseInstallationId=" + this.f13454f + ", firebaseAuthenticationToken=" + this.f13455g + ')';
    }
}
