package i5;
public final class q {
    public final long f15326a;
    public final long f15327b;
    public final long f15328c;

    public q(long j3, long j10, long j11) {
        this.f15326a = j3;
        this.f15327b = j10;
        this.f15328c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15326a == qVar.f15326a && this.f15328c == qVar.f15328c && this.f15327b == qVar.f15327b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f15326a;
        long j10 = this.f15327b;
        long j11 = this.f15328c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f15326a + ", samplesPerChunk=" + this.f15327b + ", sampleDescriptionIndex=" + this.f15328c + '}';
    }
}
