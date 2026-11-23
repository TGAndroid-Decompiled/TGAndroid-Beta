package o9;

import a8.p0;
public final class a {
    public final long f21742a;
    public final long f21743b;
    public final long f21744c;

    public a(long j3, long j10, long j11) {
        this.f21742a = j3;
        this.f21743b = j10;
        this.f21744c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f21742a == aVar.f21742a && this.f21743b == aVar.f21743b && this.f21744c == aVar.f21744c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f21742a;
        long j10 = this.f21743b;
        long j11 = this.f21744c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f21742a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f21743b);
        sb2.append(", uptimeMillis=");
        return p0.r(sb2, this.f21744c, "}");
    }
}
