package k9;
public final class a {
    public final long f13524a;
    public final long f13525b;
    public final long f13526c;

    public a(long j3, long j10, long j11) {
        this.f13524a = j3;
        this.f13525b = j10;
        this.f13526c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13524a == aVar.f13524a && this.f13525b == aVar.f13525b && this.f13526c == aVar.f13526c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13524a;
        long j10 = this.f13525b;
        long j11 = this.f13526c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f13524a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f13525b);
        sb2.append(", uptimeMillis=");
        return a4.a.s(sb2, this.f13526c, "}");
    }
}
