package k9;
public final class a {
    public final long f14844a;
    public final long f14845b;
    public final long f14846c;

    public a(long j3, long j10, long j11) {
        this.f14844a = j3;
        this.f14845b = j10;
        this.f14846c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14844a == aVar.f14844a && this.f14845b == aVar.f14845b && this.f14846c == aVar.f14846c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14844a;
        long j10 = this.f14845b;
        long j11 = this.f14846c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f14844a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f14845b);
        sb2.append(", uptimeMillis=");
        return a4.a.r(sb2, this.f14846c, "}");
    }
}
