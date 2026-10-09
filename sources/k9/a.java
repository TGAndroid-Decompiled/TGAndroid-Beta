package k9;
public final class a {
    public final long f14735a;
    public final long f14736b;
    public final long f14737c;

    public a(long j3, long j10, long j11) {
        this.f14735a = j3;
        this.f14736b = j10;
        this.f14737c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14735a == aVar.f14735a && this.f14736b == aVar.f14736b && this.f14737c == aVar.f14737c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14735a;
        long j10 = this.f14736b;
        long j11 = this.f14737c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f14735a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f14736b);
        sb2.append(", uptimeMillis=");
        return a1.g.s(sb2, this.f14737c, "}");
    }
}
