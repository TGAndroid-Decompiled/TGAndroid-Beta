package l9;
public final class a {
    public final long f15957a;
    public final long f15958b;
    public final long f15959c;

    public a(long j10, long j11, long j12) {
        this.f15957a = j10;
        this.f15958b = j11;
        this.f15959c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f15957a == aVar.f15957a && this.f15958b == aVar.f15958b && this.f15959c == aVar.f15959c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f15957a;
        long j11 = this.f15958b;
        long j12 = this.f15959c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f15957a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f15958b);
        sb2.append(", uptimeMillis=");
        return a1.g.r(sb2, this.f15959c, "}");
    }
}
