package k9;
public final class a {
    public final long f14702a;
    public final long f14703b;
    public final long f14704c;

    public a(long j3, long j10, long j11) {
        this.f14702a = j3;
        this.f14703b = j10;
        this.f14704c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14702a == aVar.f14702a && this.f14703b == aVar.f14703b && this.f14704c == aVar.f14704c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14702a;
        long j10 = this.f14703b;
        long j11 = this.f14704c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f14702a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f14703b);
        sb2.append(", uptimeMillis=");
        return a4.a.r(sb2, this.f14704c, "}");
    }
}
