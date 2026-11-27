package defpackage;
public final class aaa {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final t63 e;
    public final String f;
    public final String g;

    public aaa(String str, String str2, int i, long j, t63 t63Var, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = t63Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aaa) {
                aaa aaaVar = (aaa) obj;
                if (!ur5.a(this.a, aaaVar.a) || !ur5.a(this.b, aaaVar.b) || this.c != aaaVar.c || this.d != aaaVar.d || !this.e.equals(aaaVar.e) || !this.f.equals(aaaVar.f) || !ur5.a(this.g, aaaVar.g)) {
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
        return this.g.hashCode() + bs2.j((this.e.hashCode() + ((((bs2.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ')';
    }
}
