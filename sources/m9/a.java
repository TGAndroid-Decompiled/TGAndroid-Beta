package m9;
public final class a {
    public final long f18368a;
    public final long f18369b;
    public final long f18370c;

    public a(long j10, long j11, long j12) {
        this.f18368a = j10;
        this.f18369b = j11;
        this.f18370c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f18368a == aVar.f18368a && this.f18369b == aVar.f18369b && this.f18370c == aVar.f18370c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f18368a;
        long j11 = this.f18369b;
        long j12 = this.f18370c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f18368a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f18369b);
        sb2.append(", uptimeMillis=");
        return a1.g.r(sb2, this.f18370c, "}");
    }
}
