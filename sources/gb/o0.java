package gb;

import com.google.android.gms.internal.vision.e2;
public final class o0 {
    public static final n0 Companion = new Object();
    public final String f13385a;
    public final String f13386b;
    public final int f13387c;
    public final long d;

    public o0(int i7, String str, String str2, int i10, long j3) {
        if (15 != (i7 & 15)) {
            oe.k.a(i7, 15, m0.f13381a.d());
            throw null;
        }
        this.f13385a = str;
        this.f13386b = str2;
        this.f13387c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13385a, o0Var.f13385a) && kotlin.jvm.internal.j.a(this.f13386b, o0Var.f13386b) && this.f13387c == o0Var.f13387c && this.d == o0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((e2.h(this.f13385a.hashCode() * 31, 31, this.f13386b) + this.f13387c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13385a + ", firstSessionId=" + this.f13386b + ", sessionIndex=" + this.f13387c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public o0(long j3, String str, String str2, int i7) {
        this.f13385a = str;
        this.f13386b = str2;
        this.f13387c = i7;
        this.d = j3;
    }
}
