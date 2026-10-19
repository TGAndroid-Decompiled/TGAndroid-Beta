package f5;
public final class q {
    public final long f10438a;
    public final long f10439b;
    public final long f10440c;

    public q(long j10, long j11, long j12) {
        this.f10438a = j10;
        this.f10439b = j11;
        this.f10440c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f10438a == qVar.f10438a && this.f10440c == qVar.f10440c && this.f10439b == qVar.f10439b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10438a;
        long j11 = this.f10439b;
        long j12 = this.f10440c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f10438a + ", samplesPerChunk=" + this.f10439b + ", sampleDescriptionIndex=" + this.f10440c + '}';
    }
}
