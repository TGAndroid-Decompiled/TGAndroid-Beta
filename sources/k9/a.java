package k9;
public final class a {
    public final long f13535a;
    public final long f13536b;
    public final long f13537c;

    public a(long j3, long j10, long j11) {
        this.f13535a = j3;
        this.f13536b = j10;
        this.f13537c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13535a == aVar.f13535a && this.f13536b == aVar.f13536b && this.f13537c == aVar.f13537c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13535a;
        long j10 = this.f13536b;
        long j11 = this.f13537c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f13535a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f13536b);
        sb2.append(", uptimeMillis=");
        return a4.a.r(sb2, this.f13537c, "}");
    }
}
