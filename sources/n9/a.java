package n9;
public final class a {
    public final long f20283a;
    public final long f20284b;
    public final long f20285c;

    public a(long j10, long j11, long j12) {
        this.f20283a = j10;
        this.f20284b = j11;
        this.f20285c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f20283a == aVar.f20283a && this.f20284b == aVar.f20284b && this.f20285c == aVar.f20285c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f20283a;
        long j11 = this.f20284b;
        long j12 = this.f20285c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f20283a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f20284b);
        sb2.append(", uptimeMillis=");
        return a1.g.r(sb2, this.f20285c, "}");
    }
}
