package gb;

import com.google.android.gms.internal.vision.e2;
public final class n0 {
    public static final m0 Companion = new Object();
    public final String f13390a;
    public final String f13391b;
    public final int f13392c;
    public final long d;

    public n0(int i7, String str, String str2, int i10, long j3) {
        if (15 != (i7 & 15)) {
            oe.k.a(i7, 15, l0.f13384a.d());
            throw null;
        }
        this.f13390a = str;
        this.f13391b = str2;
        this.f13392c = i10;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.j.a(this.f13390a, n0Var.f13390a) && kotlin.jvm.internal.j.a(this.f13391b, n0Var.f13391b) && this.f13392c == n0Var.f13392c && this.d == n0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((e2.h(this.f13390a.hashCode() * 31, 31, this.f13391b) + this.f13392c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13390a + ", firstSessionId=" + this.f13391b + ", sessionIndex=" + this.f13392c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public n0(long j3, String str, String str2, int i7) {
        this.f13390a = str;
        this.f13391b = str2;
        this.f13392c = i7;
        this.d = j3;
    }
}
