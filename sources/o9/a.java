package o9;

import a8.p0;
public final class a {
    public final long f20863a;
    public final long f20864b;
    public final long f20865c;

    public a(long j3, long j10, long j11) {
        this.f20863a = j3;
        this.f20864b = j10;
        this.f20865c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f20863a == aVar.f20863a && this.f20864b == aVar.f20864b && this.f20865c == aVar.f20865c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f20863a;
        long j10 = this.f20864b;
        long j11 = this.f20865c;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f20863a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f20864b);
        sb2.append(", uptimeMillis=");
        return p0.r(sb2, this.f20865c, "}");
    }
}
