package k9;
public final class a {
    public final long f14731a;
    public final long f14732b;
    public final long f14733c;

    public a(long j3, long j10, long j11) {
        this.f14731a = j3;
        this.f14732b = j10;
        this.f14733c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14731a == aVar.f14731a && this.f14732b == aVar.f14732b && this.f14733c == aVar.f14733c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14731a;
        long j10 = this.f14732b;
        long j11 = this.f14733c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f14731a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f14732b);
        sb2.append(", uptimeMillis=");
        return a1.g.s(sb2, this.f14733c, "}");
    }
}
