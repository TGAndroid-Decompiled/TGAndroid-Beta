package gb;
public final class x0 {
    public final String f13776a;
    public final String f13777b;
    public final int f13778c;
    public final long d;
    public final k f13779e;
    public final String f13780f;
    public final String f13781g;

    public x0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f13776a = sessionId;
        this.f13777b = firstSessionId;
        this.f13778c = i7;
        this.d = j3;
        this.f13779e = kVar;
        this.f13780f = str;
        this.f13781g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (kotlin.jvm.internal.j.a(this.f13776a, x0Var.f13776a) && kotlin.jvm.internal.j.a(this.f13777b, x0Var.f13777b) && this.f13778c == x0Var.f13778c && this.d == x0Var.d && kotlin.jvm.internal.j.a(this.f13779e, x0Var.f13779e) && kotlin.jvm.internal.j.a(this.f13780f, x0Var.f13780f) && kotlin.jvm.internal.j.a(this.f13781g, x0Var.f13781g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return this.f13781g.hashCode() + com.google.android.recaptcha.internal.a.h((this.f13779e.hashCode() + ((((com.google.android.recaptcha.internal.a.h(this.f13776a.hashCode() * 31, 31, this.f13777b) + this.f13778c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f13780f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f13776a + ", firstSessionId=" + this.f13777b + ", sessionIndex=" + this.f13778c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f13779e + ", firebaseInstallationId=" + this.f13780f + ", firebaseAuthenticationToken=" + this.f13781g + ')';
    }
}
