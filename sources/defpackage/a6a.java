package defpackage;
public final class a6a {
    public static final z5a Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public a6a(int i, String str, String str2, int i2, long j) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = i2;
            this.d = j;
            return;
        }
        are.a(i, 15, y5a.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6a)) {
            return false;
        }
        a6a a6aVar = (a6a) obj;
        if (rp5.a(this.a, a6aVar.a) && rp5.a(this.b, a6aVar.b) && this.c == a6aVar.c && this.d == a6aVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return ((ir2.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public a6a(long j, String str, String str2, int i) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
