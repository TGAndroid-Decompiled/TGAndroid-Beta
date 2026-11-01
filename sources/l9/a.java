package l9;
public final class a {
    public final long f11696a;
    public final long f11697b;
    public final long f11698c;

    public a(long j10, long j11, long j12) {
        this.f11696a = j10;
        this.f11697b = j11;
        this.f11698c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f11696a == aVar.f11696a && this.f11697b == aVar.f11697b && this.f11698c == aVar.f11698c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f11696a;
        long j11 = this.f11697b;
        long j12 = this.f11698c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f11696a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f11697b);
        sb2.append(", uptimeMillis=");
        return a1.g.q(sb2, this.f11698c, "}");
    }
}
