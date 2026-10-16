package f5;
public final class q {
    public final long f8998a;
    public final long f8999b;
    public final long f9000c;

    public q(long j10, long j11, long j12) {
        this.f8998a = j10;
        this.f8999b = j11;
        this.f9000c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8998a == qVar.f8998a && this.f9000c == qVar.f9000c && this.f8999b == qVar.f8999b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8998a;
        long j11 = this.f8999b;
        long j12 = this.f9000c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8998a + ", samplesPerChunk=" + this.f8999b + ", sampleDescriptionIndex=" + this.f9000c + '}';
    }
}
