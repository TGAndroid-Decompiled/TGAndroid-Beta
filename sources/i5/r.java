package i5;
public final class r {
    public final long f16122a;
    public final long f16123b;
    public final long f16124c;

    public r(long j3, long j10, long j11) {
        this.f16122a = j3;
        this.f16123b = j10;
        this.f16124c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f16122a == rVar.f16122a && this.f16124c == rVar.f16124c && this.f16123b == rVar.f16123b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f16122a;
        long j10 = this.f16123b;
        long j11 = this.f16124c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f16122a + ", samplesPerChunk=" + this.f16123b + ", sampleDescriptionIndex=" + this.f16124c + '}';
    }
}
