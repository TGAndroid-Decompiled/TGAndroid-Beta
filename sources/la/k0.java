package la;

import kh.a2;
public final class k0 {
    public final String f11797a;
    public final String f11798b;
    public final int f11799c;
    public final long d;
    public final j e;
    public final String f11800f;

    public k0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f11797a = sessionId;
        this.f11798b = firstSessionId;
        this.f11799c = i10;
        this.d = j10;
        this.e = jVar;
        this.f11800f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.j.a(this.f11797a, k0Var.f11797a) && kotlin.jvm.internal.j.a(this.f11798b, k0Var.f11798b) && this.f11799c == k0Var.f11799c && this.d == k0Var.d && kotlin.jvm.internal.j.a(this.e, k0Var.e) && kotlin.jvm.internal.j.a(this.f11800f, k0Var.f11800f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.e.hashCode();
        return this.f11800f.hashCode() + ((hashCode + ((((a2.e(this.f11797a.hashCode() * 31, 31, this.f11798b) + this.f11799c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f11797a + ", firstSessionId=" + this.f11798b + ", sessionIndex=" + this.f11799c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f11800f + ')';
    }
}
