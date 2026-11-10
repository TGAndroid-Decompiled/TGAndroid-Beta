package o9;

import a8.p0;
public final class a {
    public final long f20868a;
    public final long f20869b;
    public final long f20870c;

    public a(long j3, long j10, long j11) {
        this.f20868a = j3;
        this.f20869b = j10;
        this.f20870c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f20868a == aVar.f20868a && this.f20869b == aVar.f20869b && this.f20870c == aVar.f20870c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f20868a;
        long j10 = this.f20869b;
        long j11 = this.f20870c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f20868a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f20869b);
        sb2.append(", uptimeMillis=");
        return p0.r(sb2, this.f20870c, "}");
    }
}
