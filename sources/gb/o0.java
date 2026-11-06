package gb;
public final class o0 {
    public static final n0 Companion = new Object();
    public final String f13736a;
    public final String f13737b;
    public final int f13738c;
    public final long d;

    public o0(int i7, String str, String str2, int i10, long j3) {
        if (15 != (i7 & 15)) {
            oe.k.a(i7, 15, m0.f13730a.d());
            throw null;
        }
        this.f13736a = str;
        this.f13737b = str2;
        this.f13738c = i10;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (kotlin.jvm.internal.j.a(this.f13736a, o0Var.f13736a) && kotlin.jvm.internal.j.a(this.f13737b, o0Var.f13737b) && this.f13738c == o0Var.f13738c && this.d == o0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((com.google.android.recaptcha.internal.a.h(this.f13736a.hashCode() * 31, 31, this.f13737b) + this.f13738c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13736a + ", firstSessionId=" + this.f13737b + ", sessionIndex=" + this.f13738c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public o0(int i7, long j3, String str, String str2) {
        this.f13736a = str;
        this.f13737b = str2;
        this.f13738c = i7;
        this.d = j3;
    }
}
