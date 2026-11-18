package gb;

import com.google.android.gms.internal.vision.e2;
public final class v0 {
    public final String f13424a;
    public final String f13425b;
    public final int f13426c;
    public final long d;
    public final k f13427e;
    public final String f13428f;
    public final String f13429g;

    public v0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13424a = sessionId;
        this.f13425b = firstSessionId;
        this.f13426c = i7;
        this.d = j3;
        this.f13427e = kVar;
        this.f13428f = str;
        this.f13429g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (kotlin.jvm.internal.j.a(this.f13424a, v0Var.f13424a) && kotlin.jvm.internal.j.a(this.f13425b, v0Var.f13425b) && this.f13426c == v0Var.f13426c && this.d == v0Var.d && kotlin.jvm.internal.j.a(this.f13427e, v0Var.f13427e) && kotlin.jvm.internal.j.a(this.f13428f, v0Var.f13428f) && kotlin.jvm.internal.j.a(this.f13429g, v0Var.f13429g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13429g.hashCode() + e2.h((this.f13427e.hashCode() + ((((e2.h(this.f13424a.hashCode() * 31, 31, this.f13425b) + this.f13426c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13428f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13424a + ", firstSessionId=" + this.f13425b + ", sessionIndex=" + this.f13426c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13427e + ", firebaseInstallationId=" + this.f13428f + ", firebaseAuthenticationToken=" + this.f13429g + ')';
    }
}
