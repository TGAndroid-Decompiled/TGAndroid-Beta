package f3;
public final class a {
    public static final a f5873f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f5874a;
    public final int f5875b;
    public final int f5876c;
    public final long d;
    public final int e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f5874a = j10;
        this.f5875b = i10;
        this.f5876c = i11;
        this.d = j11;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5874a == aVar.f5874a && this.f5875b == aVar.f5875b && this.f5876c == aVar.f5876c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5874a;
        long j11 = this.d;
        return this.e ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f5875b) * 1000003) ^ this.f5876c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f5874a);
        sb.append(", loadBatchSize=");
        sb.append(this.f5875b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f5876c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return android.support.v4.media.a.m(this.e, "}", sb);
    }
}
