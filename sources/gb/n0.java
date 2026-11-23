package gb;

import com.google.android.gms.internal.vision.e2;
public final class n0 {
    public static final m0 Companion = new Object();
    public final String f13419a;
    public final String f13420b;
    public final int f13421c;
    public final long d;

    public n0(int i7, String str, String str2, int i10, long j3) {
        if (15 != (i7 & 15)) {
            oe.k.a(i7, 15, l0.f13413a.d());
            throw null;
        }
        this.f13419a = str;
        this.f13420b = str2;
        this.f13421c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13419a, n0Var.f13419a) && kotlin.jvm.internal.j.a(this.f13420b, n0Var.f13420b) && this.f13421c == n0Var.f13421c && this.d == n0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((e2.h(this.f13419a.hashCode() * 31, 31, this.f13420b) + this.f13421c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13419a + ", firstSessionId=" + this.f13420b + ", sessionIndex=" + this.f13421c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public n0(long j3, String str, String str2, int i7) {
        this.f13419a = str;
        this.f13420b = str2;
        this.f13421c = i7;
        this.d = j3;
    }
}
