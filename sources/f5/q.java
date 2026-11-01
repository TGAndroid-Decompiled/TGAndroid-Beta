package f5;
public final class q {
    public final long f6891a;
    public final long f6892b;
    public final long f6893c;

    public q(long j10, long j11, long j12) {
        this.f6891a = j10;
        this.f6892b = j11;
        this.f6893c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f6891a == qVar.f6891a && this.f6893c == qVar.f6893c && this.f6892b == qVar.f6892b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6891a;
        long j11 = this.f6892b;
        long j12 = this.f6893c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f6891a + ", samplesPerChunk=" + this.f6892b + ", sampleDescriptionIndex=" + this.f6893c + '}';
    }
}
