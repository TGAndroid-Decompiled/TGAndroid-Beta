package o9;

import a8.p0;
public final class a {
    public final long f21776a;
    public final long f21777b;
    public final long f21778c;

    public a(long j3, long j10, long j11) {
        this.f21776a = j3;
        this.f21777b = j10;
        this.f21778c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f21776a == aVar.f21776a && this.f21777b == aVar.f21777b && this.f21778c == aVar.f21778c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f21776a;
        long j10 = this.f21777b;
        long j11 = this.f21778c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f21776a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f21777b);
        sb2.append(", uptimeMillis=");
        return p0.r(sb2, this.f21778c, "}");
    }
}
