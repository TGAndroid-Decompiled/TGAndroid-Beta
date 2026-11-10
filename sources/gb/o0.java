package gb;
public final class o0 {
    public static final n0 Companion = new Object();
    public final String f13738a;
    public final String f13739b;
    public final int f13740c;
    public final long d;

    public o0(int i7, String str, String str2, int i10, long j3) {
        if (15 != (i7 & 15)) {
            oe.k.a(i7, 15, m0.f13732a.d());
            throw null;
        }
        this.f13738a = str;
        this.f13739b = str2;
        this.f13740c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13738a, o0Var.f13738a) && kotlin.jvm.internal.j.a(this.f13739b, o0Var.f13739b) && this.f13740c == o0Var.f13740c && this.d == o0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((com.google.android.recaptcha.internal.a.h(this.f13738a.hashCode() * 31, 31, this.f13739b) + this.f13740c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13738a + ", firstSessionId=" + this.f13739b + ", sessionIndex=" + this.f13740c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public o0(int i7, long j3, String str, String str2) {
        this.f13738a = str;
        this.f13739b = str2;
        this.f13740c = i7;
        this.d = j3;
    }
}
