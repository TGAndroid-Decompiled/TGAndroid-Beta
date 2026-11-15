package o9;

import a8.p0;
public final class a {
    public final long f21385a;
    public final long f21386b;
    public final long f21387c;

    public a(long j3, long j10, long j11) {
        this.f21385a = j3;
        this.f21386b = j10;
        this.f21387c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f21385a == aVar.f21385a && this.f21386b == aVar.f21386b && this.f21387c == aVar.f21387c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f21385a;
        long j10 = this.f21386b;
        long j11 = this.f21387c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f21385a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f21386b);
        sb2.append(", uptimeMillis=");
        return p0.r(sb2, this.f21387c, "}");
    }
}
