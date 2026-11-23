package i5;
public final class r {
    public final long f16186a;
    public final long f16187b;
    public final long f16188c;

    public r(long j3, long j10, long j11) {
        this.f16186a = j3;
        this.f16187b = j10;
        this.f16188c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f16186a == rVar.f16186a && this.f16188c == rVar.f16188c && this.f16187b == rVar.f16187b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f16186a;
        long j10 = this.f16187b;
        long j11 = this.f16188c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f16186a + ", samplesPerChunk=" + this.f16187b + ", sampleDescriptionIndex=" + this.f16188c + '}';
    }
}
