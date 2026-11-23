package i5;
public final class r {
    public final long f16091a;
    public final long f16092b;
    public final long f16093c;

    public r(long j3, long j10, long j11) {
        this.f16091a = j3;
        this.f16092b = j10;
        this.f16093c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f16091a == rVar.f16091a && this.f16093c == rVar.f16093c && this.f16092b == rVar.f16092b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f16091a;
        long j10 = this.f16092b;
        long j11 = this.f16093c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f16091a + ", samplesPerChunk=" + this.f16092b + ", sampleDescriptionIndex=" + this.f16093c + '}';
    }
}
