package f5;
public final class q {
    public final long f8995a;
    public final long f8996b;
    public final long f8997c;

    public q(long j10, long j11, long j12) {
        this.f8995a = j10;
        this.f8996b = j11;
        this.f8997c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8995a == qVar.f8995a && this.f8997c == qVar.f8997c && this.f8996b == qVar.f8996b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8995a;
        long j11 = this.f8996b;
        long j12 = this.f8997c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8995a + ", samplesPerChunk=" + this.f8996b + ", sampleDescriptionIndex=" + this.f8997c + '}';
    }
}
