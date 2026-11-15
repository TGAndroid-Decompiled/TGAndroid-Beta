package gb;

import com.google.android.gms.internal.vision.e2;
public final class v0 {
    public final String f13107a;
    public final String f13108b;
    public final int f13109c;
    public final long d;
    public final k f13110e;
    public final String f13111f;
    public final String f13112g;

    public v0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13107a = sessionId;
        this.f13108b = firstSessionId;
        this.f13109c = i7;
        this.d = j3;
        this.f13110e = kVar;
        this.f13111f = str;
        this.f13112g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (kotlin.jvm.internal.j.a(this.f13107a, v0Var.f13107a) && kotlin.jvm.internal.j.a(this.f13108b, v0Var.f13108b) && this.f13109c == v0Var.f13109c && this.d == v0Var.d && kotlin.jvm.internal.j.a(this.f13110e, v0Var.f13110e) && kotlin.jvm.internal.j.a(this.f13111f, v0Var.f13111f) && kotlin.jvm.internal.j.a(this.f13112g, v0Var.f13112g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13112g.hashCode() + e2.h((this.f13110e.hashCode() + ((((e2.h(this.f13107a.hashCode() * 31, 31, this.f13108b) + this.f13109c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13111f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13107a + ", firstSessionId=" + this.f13108b + ", sessionIndex=" + this.f13109c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13110e + ", firebaseInstallationId=" + this.f13111f + ", firebaseAuthenticationToken=" + this.f13112g + ')';
    }
}
