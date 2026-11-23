package i5;
public final class r {
    public final long f16125a;
    public final long f16126b;
    public final long f16127c;

    public r(long j3, long j10, long j11) {
        this.f16125a = j3;
        this.f16126b = j10;
        this.f16127c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f16125a == rVar.f16125a && this.f16127c == rVar.f16127c && this.f16126b == rVar.f16126b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f16125a;
        long j10 = this.f16126b;
        long j11 = this.f16127c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f16125a + ", samplesPerChunk=" + this.f16126b + ", sampleDescriptionIndex=" + this.f16127c + '}';
    }
}
