package i5;
public final class r {
    public final long f16097a;
    public final long f16098b;
    public final long f16099c;

    public r(long j3, long j10, long j11) {
        this.f16097a = j3;
        this.f16098b = j10;
        this.f16099c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f16097a == rVar.f16097a && this.f16099c == rVar.f16099c && this.f16098b == rVar.f16098b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f16097a;
        long j10 = this.f16098b;
        long j11 = this.f16099c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f16097a + ", samplesPerChunk=" + this.f16098b + ", sampleDescriptionIndex=" + this.f16099c + '}';
    }
}
