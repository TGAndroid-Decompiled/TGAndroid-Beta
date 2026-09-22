package k9;
public final class a {
    public final long f13536a;
    public final long f13537b;
    public final long f13538c;

    public a(long j3, long j10, long j11) {
        this.f13536a = j3;
        this.f13537b = j10;
        this.f13538c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13536a == aVar.f13536a && this.f13537b == aVar.f13537b && this.f13538c == aVar.f13538c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13536a;
        long j10 = this.f13537b;
        long j11 = this.f13538c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f13536a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f13537b);
        sb2.append(", uptimeMillis=");
        return a4.a.s(sb2, this.f13538c, "}");
    }
}
