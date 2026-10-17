package l9;
public final class a {
    public final long f15949a;
    public final long f15950b;
    public final long f15951c;

    public a(long j10, long j11, long j12) {
        this.f15949a = j10;
        this.f15950b = j11;
        this.f15951c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f15949a == aVar.f15949a && this.f15950b == aVar.f15950b && this.f15951c == aVar.f15951c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f15949a;
        long j11 = this.f15950b;
        long j12 = this.f15951c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f15949a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f15950b);
        sb2.append(", uptimeMillis=");
        return a1.g.r(sb2, this.f15951c, "}");
    }
}
