package f5;
public final class q {
    public final long f9718a;
    public final long f9719b;
    public final long f9720c;

    public q(long j3, long j10, long j11) {
        this.f9718a = j3;
        this.f9719b = j10;
        this.f9720c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f9718a == qVar.f9718a && this.f9720c == qVar.f9720c && this.f9719b == qVar.f9719b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9718a;
        long j10 = this.f9719b;
        long j11 = this.f9720c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f9718a + ", samplesPerChunk=" + this.f9719b + ", sampleDescriptionIndex=" + this.f9720c + '}';
    }
}
