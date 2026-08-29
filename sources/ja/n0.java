package ja;

import j7.l1;
public final class n0 {
    public final String f11385a;
    public final String f11386b;
    public final int f11387c;
    public final long d;
    public final j f11388e;
    public final String f11389f;

    public n0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.f11385a = sessionId;
        this.f11386b = firstSessionId;
        this.f11387c = i10;
        this.d = j10;
        this.f11388e = jVar;
        this.f11389f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.j.a(this.f11385a, n0Var.f11385a) && kotlin.jvm.internal.j.a(this.f11386b, n0Var.f11386b) && this.f11387c == n0Var.f11387c && this.d == n0Var.d && kotlin.jvm.internal.j.a(this.f11388e, n0Var.f11388e) && kotlin.jvm.internal.j.a(this.f11389f, n0Var.f11389f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        int hashCode = this.f11388e.hashCode();
        return this.f11389f.hashCode() + ((hashCode + ((((l1.f(this.f11385a.hashCode() * 31, 31, this.f11386b) + this.f11387c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f11385a + ", firstSessionId=" + this.f11386b + ", sessionIndex=" + this.f11387c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f11388e + ", firebaseInstallationId=" + this.f11389f + ')';
    }
}
