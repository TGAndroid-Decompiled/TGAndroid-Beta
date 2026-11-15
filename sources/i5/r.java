package i5;
public final class r {
    public final long f15782a;
    public final long f15783b;
    public final long f15784c;

    public r(long j3, long j10, long j11) {
        this.f15782a = j3;
        this.f15783b = j10;
        this.f15784c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f15782a == rVar.f15782a && this.f15784c == rVar.f15784c && this.f15783b == rVar.f15783b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f15782a;
        long j10 = this.f15783b;
        long j11 = this.f15784c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f15782a + ", samplesPerChunk=" + this.f15783b + ", sampleDescriptionIndex=" + this.f15784c + '}';
    }
}
