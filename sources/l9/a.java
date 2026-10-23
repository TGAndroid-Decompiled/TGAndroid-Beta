package l9;
public final class a {
    public final long f16018a;
    public final long f16019b;
    public final long f16020c;

    public a(long j10, long j11, long j12) {
        this.f16018a = j10;
        this.f16019b = j11;
        this.f16020c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f16018a == aVar.f16018a && this.f16019b == aVar.f16019b && this.f16020c == aVar.f16020c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16018a;
        long j11 = this.f16019b;
        long j12 = this.f16020c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f16018a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f16019b);
        sb2.append(", uptimeMillis=");
        return a1.g.r(sb2, this.f16020c, "}");
    }
}
