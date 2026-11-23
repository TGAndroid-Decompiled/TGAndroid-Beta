package gb;

import com.google.android.gms.internal.vision.e2;
public final class w0 {
    public final String f13420a;
    public final String f13421b;
    public final int f13422c;
    public final long d;
    public final k f13423e;
    public final String f13424f;
    public final String f13425g;

    public w0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13420a = sessionId;
        this.f13421b = firstSessionId;
        this.f13422c = i7;
        this.d = j3;
        this.f13423e = kVar;
        this.f13424f = str;
        this.f13425g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (kotlin.jvm.internal.j.a(this.f13420a, w0Var.f13420a) && kotlin.jvm.internal.j.a(this.f13421b, w0Var.f13421b) && this.f13422c == w0Var.f13422c && this.d == w0Var.d && kotlin.jvm.internal.j.a(this.f13423e, w0Var.f13423e) && kotlin.jvm.internal.j.a(this.f13424f, w0Var.f13424f) && kotlin.jvm.internal.j.a(this.f13425g, w0Var.f13425g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13425g.hashCode() + e2.h((this.f13423e.hashCode() + ((((e2.h(this.f13420a.hashCode() * 31, 31, this.f13421b) + this.f13422c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13424f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13420a + ", firstSessionId=" + this.f13421b + ", sessionIndex=" + this.f13422c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13423e + ", firebaseInstallationId=" + this.f13424f + ", firebaseAuthenticationToken=" + this.f13425g + ')';
    }
}
