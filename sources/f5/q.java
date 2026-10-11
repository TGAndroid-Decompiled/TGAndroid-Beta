package f5;
public final class q {
    public final long f9720a;
    public final long f9721b;
    public final long f9722c;

    public q(long j3, long j10, long j11) {
        this.f9720a = j3;
        this.f9721b = j10;
        this.f9722c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f9720a == qVar.f9720a && this.f9722c == qVar.f9722c && this.f9721b == qVar.f9721b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9720a;
        long j10 = this.f9721b;
        long j11 = this.f9722c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f9720a + ", samplesPerChunk=" + this.f9721b + ", sampleDescriptionIndex=" + this.f9722c + '}';
    }
}
