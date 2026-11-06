package o9;

import a8.p0;
public final class a {
    public final long f20860a;
    public final long f20861b;
    public final long f20862c;

    public a(long j3, long j10, long j11) {
        this.f20860a = j3;
        this.f20861b = j10;
        this.f20862c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f20860a == aVar.f20860a && this.f20861b == aVar.f20861b && this.f20862c == aVar.f20862c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f20860a;
        long j10 = this.f20861b;
        long j11 = this.f20862c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f20860a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f20861b);
        sb2.append(", uptimeMillis=");
        return p0.r(sb2, this.f20862c, "}");
    }
}
