package gb;

import com.google.android.gms.internal.vision.e2;
public final class v0 {
    public final String f13453a;
    public final String f13454b;
    public final int f13455c;
    public final long d;
    public final k f13456e;
    public final String f13457f;
    public final String f13458g;

    public v0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13453a = sessionId;
        this.f13454b = firstSessionId;
        this.f13455c = i7;
        this.d = j3;
        this.f13456e = kVar;
        this.f13457f = str;
        this.f13458g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (kotlin.jvm.internal.j.a(this.f13453a, v0Var.f13453a) && kotlin.jvm.internal.j.a(this.f13454b, v0Var.f13454b) && this.f13455c == v0Var.f13455c && this.d == v0Var.d && kotlin.jvm.internal.j.a(this.f13456e, v0Var.f13456e) && kotlin.jvm.internal.j.a(this.f13457f, v0Var.f13457f) && kotlin.jvm.internal.j.a(this.f13458g, v0Var.f13458g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13458g.hashCode() + e2.h((this.f13456e.hashCode() + ((((e2.h(this.f13453a.hashCode() * 31, 31, this.f13454b) + this.f13455c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13457f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13453a + ", firstSessionId=" + this.f13454b + ", sessionIndex=" + this.f13455c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13456e + ", firebaseInstallationId=" + this.f13457f + ", firebaseAuthenticationToken=" + this.f13458g + ')';
    }
}
