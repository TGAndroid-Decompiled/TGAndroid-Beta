package defpackage;
public final class s9a {
    public static final r9a Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public s9a(int i, String str, String str2, int i2, long j) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = i2;
            this.d = j;
            return;
        }
        sve.a(i, 15, q9a.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9a)) {
            return false;
        }
        s9a s9aVar = (s9a) obj;
        if (ur5.a(this.a, s9aVar.a) && ur5.a(this.b, s9aVar.b) && this.c == s9aVar.c && this.d == s9aVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return ((bs2.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public s9a(long j, String str, String str2, int i) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
