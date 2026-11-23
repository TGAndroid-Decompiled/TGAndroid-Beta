package gb;

import com.google.android.gms.internal.vision.e2;
public final class v0 {
    public final String f13416a;
    public final String f13417b;
    public final int f13418c;
    public final long d;
    public final k f13419e;
    public final String f13420f;
    public final String f13421g;

    public v0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13416a = sessionId;
        this.f13417b = firstSessionId;
        this.f13418c = i7;
        this.d = j3;
        this.f13419e = kVar;
        this.f13420f = str;
        this.f13421g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (kotlin.jvm.internal.j.a(this.f13416a, v0Var.f13416a) && kotlin.jvm.internal.j.a(this.f13417b, v0Var.f13417b) && this.f13418c == v0Var.f13418c && this.d == v0Var.d && kotlin.jvm.internal.j.a(this.f13419e, v0Var.f13419e) && kotlin.jvm.internal.j.a(this.f13420f, v0Var.f13420f) && kotlin.jvm.internal.j.a(this.f13421g, v0Var.f13421g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13421g.hashCode() + e2.h((this.f13419e.hashCode() + ((((e2.h(this.f13416a.hashCode() * 31, 31, this.f13417b) + this.f13418c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13420f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13416a + ", firstSessionId=" + this.f13417b + ", sessionIndex=" + this.f13418c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13419e + ", firebaseInstallationId=" + this.f13420f + ", firebaseAuthenticationToken=" + this.f13421g + ')';
    }
}
