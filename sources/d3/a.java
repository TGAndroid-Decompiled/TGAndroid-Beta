package d3;

import a9.p;

public final class a {

    public static final a f4729f = new a(200, 10485760, 604800000, 10000, 81920);

    public final long f4730a;

    public final int f4731b;

    public final int f4732c;
    public final long d;

    public final int f4733e;

    public a(int i10, long j10, long j11, int i11, int i12) {
        this.f4730a = j10;
        this.f4731b = i10;
        this.f4732c = i11;
        this.d = j11;
        this.f4733e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f4730a == aVar.f4730a && this.f4731b == aVar.f4731b && this.f4732c == aVar.f4732c && this.d == aVar.d && this.f4733e == aVar.f4733e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4730a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f4731b) * 1000003) ^ this.f4732c) * 1000003;
        long j11 = this.d;
        return this.f4733e ^ ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f4730a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f4731b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f4732c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p.k(this.f4733e, "}", sb2);
    }
}
