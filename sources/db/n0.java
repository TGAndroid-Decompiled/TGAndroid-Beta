package db;
public final class n0 {
    public static final m0 Companion = new Object();
    public final String f8706a;
    public final String f8707b;
    public final int f8708c;
    public final long d;

    public n0(int i3, String str, String str2, int i10, long j10) {
        if (15 != (i3 & 15)) {
            le.k.a(i3, 15, l0.f8700a.d());
            throw null;
        }
        this.f8706a = str;
        this.f8707b = str2;
        this.f8708c = i10;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.j.a(this.f8706a, n0Var.f8706a) && kotlin.jvm.internal.j.a(this.f8707b, n0Var.f8707b) && this.f8708c == n0Var.f8708c && this.d == n0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((com.google.android.recaptcha.internal.a.g(this.f8706a.hashCode() * 31, 31, this.f8707b) + this.f8708c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f8706a + ", firstSessionId=" + this.f8707b + ", sessionIndex=" + this.f8708c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public n0(int i3, long j10, String str, String str2) {
        this.f8706a = str;
        this.f8707b = str2;
        this.f8708c = i3;
        this.d = j10;
    }
}
