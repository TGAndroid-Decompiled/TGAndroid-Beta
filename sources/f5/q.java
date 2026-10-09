package f5;
public final class q {
    public final long f9721a;
    public final long f9722b;
    public final long f9723c;

    public q(long j3, long j10, long j11) {
        this.f9721a = j3;
        this.f9722b = j10;
        this.f9723c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f9721a == qVar.f9721a && this.f9723c == qVar.f9723c && this.f9722b == qVar.f9722b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9721a;
        long j10 = this.f9722b;
        long j11 = this.f9723c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f9721a + ", samplesPerChunk=" + this.f9722b + ", sampleDescriptionIndex=" + this.f9723c + '}';
    }
}
