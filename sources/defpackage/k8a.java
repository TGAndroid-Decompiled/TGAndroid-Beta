package defpackage;
public final class k8a {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final m73 e;
    public final String f;
    public final String g;

    public k8a(String str, String str2, int i, long j, m73 m73Var, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = m73Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k8a) {
                k8a k8aVar = (k8a) obj;
                if (!rr5.a(this.a, k8aVar.a) || !rr5.a(this.b, k8aVar.b) || this.c != k8aVar.c || this.d != k8aVar.d || !this.e.equals(k8aVar.e) || !this.f.equals(k8aVar.f) || !rr5.a(this.g, k8aVar.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.d;
        return this.g.hashCode() + ts2.j((this.e.hashCode() + ((((ts2.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ')';
    }
}
