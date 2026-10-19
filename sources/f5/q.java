package f5;
public final class q {
    public final long f10440a;
    public final long f10441b;
    public final long f10442c;

    public q(long j10, long j11, long j12) {
        this.f10440a = j10;
        this.f10441b = j11;
        this.f10442c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f10440a == qVar.f10440a && this.f10442c == qVar.f10442c && this.f10441b == qVar.f10441b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10440a;
        long j11 = this.f10441b;
        long j12 = this.f10442c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f10440a + ", samplesPerChunk=" + this.f10441b + ", sampleDescriptionIndex=" + this.f10442c + '}';
    }
}
