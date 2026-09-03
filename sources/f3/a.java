package f3;
public final class a {
    public static final a f5862f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f5863a;
    public final int f5864b;
    public final int f5865c;
    public final long d;
    public final int e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f5863a = j10;
        this.f5864b = i10;
        this.f5865c = i11;
        this.d = j11;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5863a == aVar.f5863a && this.f5864b == aVar.f5864b && this.f5865c == aVar.f5865c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5863a;
        long j11 = this.d;
        return this.e ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f5864b) * 1000003) ^ this.f5865c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f5863a);
        sb.append(", loadBatchSize=");
        sb.append(this.f5864b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f5865c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return android.support.v4.media.a.m(this.e, "}", sb);
    }
}
