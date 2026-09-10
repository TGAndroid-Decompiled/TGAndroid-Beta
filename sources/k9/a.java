package k9;
public final class a {
    public final long f12380a;
    public final long f12381b;
    public final long f12382c;

    public a(long j3, long j10, long j11) {
        this.f12380a = j3;
        this.f12381b = j10;
        this.f12382c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f12380a == aVar.f12380a && this.f12381b == aVar.f12381b && this.f12382c == aVar.f12382c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f12380a;
        long j10 = this.f12381b;
        long j11 = this.f12382c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f12380a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f12381b);
        sb2.append(", uptimeMillis=");
        return a4.a.r(sb2, this.f12382c, "}");
    }
}
