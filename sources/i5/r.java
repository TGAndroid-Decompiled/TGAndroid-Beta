package i5;
public final class r {
    public final long f16100a;
    public final long f16101b;
    public final long f16102c;

    public r(long j3, long j10, long j11) {
        this.f16100a = j3;
        this.f16101b = j10;
        this.f16102c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f16100a == rVar.f16100a && this.f16102c == rVar.f16102c && this.f16101b == rVar.f16101b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f16100a;
        long j10 = this.f16101b;
        long j11 = this.f16102c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f16100a + ", samplesPerChunk=" + this.f16101b + ", sampleDescriptionIndex=" + this.f16102c + '}';
    }
}
