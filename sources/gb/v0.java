package gb;

import com.google.android.gms.internal.vision.e2;
public final class v0 {
    public final String f13421a;
    public final String f13422b;
    public final int f13423c;
    public final long d;
    public final k f13424e;
    public final String f13425f;
    public final String f13426g;

    public v0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13421a = sessionId;
        this.f13422b = firstSessionId;
        this.f13423c = i7;
        this.d = j3;
        this.f13424e = kVar;
        this.f13425f = str;
        this.f13426g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (kotlin.jvm.internal.j.a(this.f13421a, v0Var.f13421a) && kotlin.jvm.internal.j.a(this.f13422b, v0Var.f13422b) && this.f13423c == v0Var.f13423c && this.d == v0Var.d && kotlin.jvm.internal.j.a(this.f13424e, v0Var.f13424e) && kotlin.jvm.internal.j.a(this.f13425f, v0Var.f13425f) && kotlin.jvm.internal.j.a(this.f13426g, v0Var.f13426g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13426g.hashCode() + e2.h((this.f13424e.hashCode() + ((((e2.h(this.f13421a.hashCode() * 31, 31, this.f13422b) + this.f13423c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13425f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13421a + ", firstSessionId=" + this.f13422b + ", sessionIndex=" + this.f13423c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13424e + ", firebaseInstallationId=" + this.f13425f + ", firebaseAuthenticationToken=" + this.f13426g + ')';
    }
}
