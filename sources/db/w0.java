package db;
public final class w0 {
    public final String f8746a;
    public final String f8747b;
    public final int f8748c;
    public final long d;
    public final k f8749e;
    public final String f8750f;
    public final String f8751g;

    public w0(String sessionId, String firstSessionId, int i3, long j10, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f8746a = sessionId;
        this.f8747b = firstSessionId;
        this.f8748c = i3;
        this.d = j10;
        this.f8749e = kVar;
        this.f8750f = str;
        this.f8751g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (kotlin.jvm.internal.j.a(this.f8746a, w0Var.f8746a) && kotlin.jvm.internal.j.a(this.f8747b, w0Var.f8747b) && this.f8748c == w0Var.f8748c && this.d == w0Var.d && kotlin.jvm.internal.j.a(this.f8749e, w0Var.f8749e) && kotlin.jvm.internal.j.a(this.f8750f, w0Var.f8750f) && kotlin.jvm.internal.j.a(this.f8751g, w0Var.f8751g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return this.f8751g.hashCode() + com.google.android.recaptcha.internal.a.g((this.f8749e.hashCode() + ((((com.google.android.recaptcha.internal.a.g(this.f8746a.hashCode() * 31, 31, this.f8747b) + this.f8748c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31, 31, this.f8750f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f8746a + ", firstSessionId=" + this.f8747b + ", sessionIndex=" + this.f8748c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f8749e + ", firebaseInstallationId=" + this.f8750f + ", firebaseAuthenticationToken=" + this.f8751g + ')';
    }
}
