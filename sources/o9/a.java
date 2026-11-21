package o9;

import a8.p0;
public final class a {
    public final long f21773a;
    public final long f21774b;
    public final long f21775c;

    public a(long j3, long j10, long j11) {
        this.f21773a = j3;
        this.f21774b = j10;
        this.f21775c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f21773a == aVar.f21773a && this.f21774b == aVar.f21774b && this.f21775c == aVar.f21775c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f21773a;
        long j10 = this.f21774b;
        long j11 = this.f21775c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f21773a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f21774b);
        sb2.append(", uptimeMillis=");
        return p0.r(sb2, this.f21775c, "}");
    }
}
