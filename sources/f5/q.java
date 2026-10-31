package f5;
public final class q {
    public final long f6890a;
    public final long f6891b;
    public final long f6892c;

    public q(long j10, long j11, long j12) {
        this.f6890a = j10;
        this.f6891b = j11;
        this.f6892c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f6890a == qVar.f6890a && this.f6892c == qVar.f6892c && this.f6891b == qVar.f6891b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6890a;
        long j11 = this.f6891b;
        long j12 = this.f6892c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f6890a + ", samplesPerChunk=" + this.f6891b + ", sampleDescriptionIndex=" + this.f6892c + '}';
    }
}
