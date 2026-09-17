package k9;
public final class a {
    public final long f13537a;
    public final long f13538b;
    public final long f13539c;

    public a(long j3, long j10, long j11) {
        this.f13537a = j3;
        this.f13538b = j10;
        this.f13539c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13537a == aVar.f13537a && this.f13538b == aVar.f13538b && this.f13539c == aVar.f13539c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13537a;
        long j10 = this.f13538b;
        long j11 = this.f13539c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f13537a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f13538b);
        sb2.append(", uptimeMillis=");
        return a4.a.r(sb2, this.f13539c, "}");
    }
}
