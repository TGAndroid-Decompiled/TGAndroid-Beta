package m9;
public final class a {
    public final long f18367a;
    public final long f18368b;
    public final long f18369c;

    public a(long j10, long j11, long j12) {
        this.f18367a = j10;
        this.f18368b = j11;
        this.f18369c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f18367a == aVar.f18367a && this.f18368b == aVar.f18368b && this.f18369c == aVar.f18369c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f18367a;
        long j11 = this.f18368b;
        long j12 = this.f18369c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f18367a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f18368b);
        sb2.append(", uptimeMillis=");
        return a1.g.r(sb2, this.f18369c, "}");
    }
}
