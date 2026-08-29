package f3;

import a4.w;
public final class a {
    public static final a f6524f = new a(200, 10485760, 604800000, 10000, 81920);
    public final long f6525a;
    public final int f6526b;
    public final int f6527c;
    public final long d;
    public final int f6528e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f6525a = j10;
        this.f6526b = i10;
        this.f6527c = i11;
        this.d = j11;
        this.f6528e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f6525a == aVar.f6525a && this.f6526b == aVar.f6526b && this.f6527c == aVar.f6527c && this.d == aVar.d && this.f6528e == aVar.f6528e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6525a;
        long j11 = this.d;
        return this.f6528e ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f6526b) * 1000003) ^ this.f6527c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f6525a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f6526b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f6527c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return w.l(this.f6528e, "}", sb2);
    }
}
