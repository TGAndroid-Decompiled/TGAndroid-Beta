package f3;
public final class a {
    public static final a f5968f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f5969a;
    public final int f5970b;
    public final int f5971c;
    public final long d;
    public final int f5972e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f5969a = j10;
        this.f5970b = i10;
        this.f5971c = i11;
        this.d = j11;
        this.f5972e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5969a == aVar.f5969a && this.f5970b == aVar.f5970b && this.f5971c == aVar.f5971c && this.d == aVar.d && this.f5972e == aVar.f5972e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5969a;
        long j11 = this.d;
        return this.f5972e ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f5970b) * 1000003) ^ this.f5971c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f5969a);
        sb.append(", loadBatchSize=");
        sb.append(this.f5970b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f5971c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return android.support.v4.media.a.m(this.f5972e, "}", sb);
    }
}
