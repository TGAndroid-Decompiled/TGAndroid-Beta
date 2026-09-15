package k9;
public final class a {
    public final long f13534a;
    public final long f13535b;
    public final long f13536c;

    public a(long j3, long j10, long j11) {
        this.f13534a = j3;
        this.f13535b = j10;
        this.f13536c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13534a == aVar.f13534a && this.f13535b == aVar.f13535b && this.f13536c == aVar.f13536c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13534a;
        long j10 = this.f13535b;
        long j11 = this.f13536c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f13534a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f13535b);
        sb2.append(", uptimeMillis=");
        return a4.a.r(sb2, this.f13536c, "}");
    }
}
