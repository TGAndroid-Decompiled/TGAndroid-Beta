package gb;
public final class x0 {
    public final String f13778a;
    public final String f13779b;
    public final int f13780c;
    public final long d;
    public final k f13781e;
    public final String f13782f;
    public final String f13783g;

    public x0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13778a = sessionId;
        this.f13779b = firstSessionId;
        this.f13780c = i7;
        this.d = j3;
        this.f13781e = kVar;
        this.f13782f = str;
        this.f13783g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (kotlin.jvm.internal.j.a(this.f13778a, x0Var.f13778a) && kotlin.jvm.internal.j.a(this.f13779b, x0Var.f13779b) && this.f13780c == x0Var.f13780c && this.d == x0Var.d && kotlin.jvm.internal.j.a(this.f13781e, x0Var.f13781e) && kotlin.jvm.internal.j.a(this.f13782f, x0Var.f13782f) && kotlin.jvm.internal.j.a(this.f13783g, x0Var.f13783g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13783g.hashCode() + com.google.android.recaptcha.internal.a.h((this.f13781e.hashCode() + ((((com.google.android.recaptcha.internal.a.h(this.f13778a.hashCode() * 31, 31, this.f13779b) + this.f13780c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13782f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13778a + ", firstSessionId=" + this.f13779b + ", sessionIndex=" + this.f13780c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13781e + ", firebaseInstallationId=" + this.f13782f + ", firebaseAuthenticationToken=" + this.f13783g + ')';
    }
}
