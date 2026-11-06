package i5;
public final class q {
    public final long f15321a;
    public final long f15322b;
    public final long f15323c;

    public q(long j3, long j10, long j11) {
        this.f15321a = j3;
        this.f15322b = j10;
        this.f15323c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15321a == qVar.f15321a && this.f15323c == qVar.f15323c && this.f15322b == qVar.f15322b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f15321a;
        long j10 = this.f15322b;
        long j11 = this.f15323c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f15321a + ", samplesPerChunk=" + this.f15322b + ", sampleDescriptionIndex=" + this.f15323c + '}';
    }
}
