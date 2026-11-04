package h5;
public final class q {
    public final long f14277a;
    public final long f14278b;
    public final long f14279c;

    public q(long j10, long j11, long j12) {
        this.f14277a = j10;
        this.f14278b = j11;
        this.f14279c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f14277a == qVar.f14277a && this.f14279c == qVar.f14279c && this.f14278b == qVar.f14278b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14277a;
        long j11 = this.f14278b;
        long j12 = this.f14279c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f14277a + ", samplesPerChunk=" + this.f14278b + ", sampleDescriptionIndex=" + this.f14279c + '}';
    }
}
