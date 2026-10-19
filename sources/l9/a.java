package l9;
public final class a {
    public final long f15955a;
    public final long f15956b;
    public final long f15957c;

    public a(long j10, long j11, long j12) {
        this.f15955a = j10;
        this.f15956b = j11;
        this.f15957c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f15955a == aVar.f15955a && this.f15956b == aVar.f15956b && this.f15957c == aVar.f15957c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f15955a;
        long j11 = this.f15956b;
        long j12 = this.f15957c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f15955a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f15956b);
        sb2.append(", uptimeMillis=");
        return a1.g.r(sb2, this.f15957c, "}");
    }
}
