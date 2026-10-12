package l9;
public final class a {
    public final long f14614a;
    public final long f14615b;
    public final long f14616c;

    public a(long j10, long j11, long j12) {
        this.f14614a = j10;
        this.f14615b = j11;
        this.f14616c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14614a == aVar.f14614a && this.f14615b == aVar.f14615b && this.f14616c == aVar.f14616c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14614a;
        long j11 = this.f14615b;
        long j12 = this.f14616c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f14614a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f14615b);
        sb2.append(", uptimeMillis=");
        return a1.g.r(sb2, this.f14616c, "}");
    }
}
