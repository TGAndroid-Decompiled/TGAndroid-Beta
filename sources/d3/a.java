package d3;
public final class a {
    public static final a f4287f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f4288a;
    public final int f4289b;
    public final int f4290c;
    public final long d;
    public final int f4291e;

    public a(int i9, long j10, long j11, int i10, int i11) {
        this.f4288a = j10;
        this.f4289b = i9;
        this.f4290c = i10;
        this.d = j11;
        this.f4291e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f4288a == aVar.f4288a && this.f4289b == aVar.f4289b && this.f4290c == aVar.f4290c && this.d == aVar.d && this.f4291e == aVar.f4291e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4288a;
        long j11 = this.d;
        return this.f4291e ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f4289b) * 1000003) ^ this.f4290c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f4288a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f4289b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f4290c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return aa.d.l(this.f4291e, "}", sb2);
    }
}
