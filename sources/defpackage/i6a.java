package defpackage;
public final class i6a {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final a63 e;
    public final String f;
    public final String g;

    public i6a(String str, String str2, int i, long j, a63 a63Var, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = a63Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i6a) {
                i6a i6aVar = (i6a) obj;
                if (!rp5.a(this.a, i6aVar.a) || !rp5.a(this.b, i6aVar.b) || this.c != i6aVar.c || this.d != i6aVar.d || !this.e.equals(i6aVar.e) || !this.f.equals(i6aVar.f) || !rp5.a(this.g, i6aVar.g)) {
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
        return this.g.hashCode() + ir2.j((this.e.hashCode() + ((((ir2.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ')';
    }
}
