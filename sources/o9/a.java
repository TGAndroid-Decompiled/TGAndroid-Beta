package o9;

import a8.p0;
public final class a {
    public final long f21842a;
    public final long f21843b;
    public final long f21844c;

    public a(long j3, long j10, long j11) {
        this.f21842a = j3;
        this.f21843b = j10;
        this.f21844c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f21842a == aVar.f21842a && this.f21843b == aVar.f21843b && this.f21844c == aVar.f21844c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f21842a;
        long j10 = this.f21843b;
        long j11 = this.f21844c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f21842a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f21843b);
        sb2.append(", uptimeMillis=");
        return p0.r(sb2, this.f21844c, "}");
    }
}
