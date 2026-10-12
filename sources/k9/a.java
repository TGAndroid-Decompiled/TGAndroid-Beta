package k9;
public final class a {
    public final long f14732a;
    public final long f14733b;
    public final long f14734c;

    public a(long j3, long j10, long j11) {
        this.f14732a = j3;
        this.f14733b = j10;
        this.f14734c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14732a == aVar.f14732a && this.f14733b == aVar.f14733b && this.f14734c == aVar.f14734c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f14732a;
        long j10 = this.f14733b;
        long j11 = this.f14734c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f14732a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f14733b);
        sb2.append(", uptimeMillis=");
        return a1.g.s(sb2, this.f14734c, "}");
    }
}
