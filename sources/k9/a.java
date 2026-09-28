package k9;
public final class a {
    public final long f13522a;
    public final long f13523b;
    public final long f13524c;

    public a(long j3, long j10, long j11) {
        this.f13522a = j3;
        this.f13523b = j10;
        this.f13524c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13522a == aVar.f13522a && this.f13523b == aVar.f13523b && this.f13524c == aVar.f13524c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13522a;
        long j10 = this.f13523b;
        long j11 = this.f13524c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f13522a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f13523b);
        sb2.append(", uptimeMillis=");
        return a4.a.s(sb2, this.f13524c, "}");
    }
}
