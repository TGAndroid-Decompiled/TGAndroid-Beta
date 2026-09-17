package k9;
public final class a {
    public final long f14870a;
    public final long f14871b;
    public final long f14872c;

    public a(long j3, long j10, long j11) {
        this.f14870a = j3;
        this.f14871b = j10;
        this.f14872c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14870a == aVar.f14870a && this.f14871b == aVar.f14871b && this.f14872c == aVar.f14872c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14870a;
        long j10 = this.f14871b;
        long j11 = this.f14872c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f14870a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f14871b);
        sb2.append(", uptimeMillis=");
        return a4.a.r(sb2, this.f14872c, "}");
    }
}
