package f5;
public final class q {
    public final long f10439a;
    public final long f10440b;
    public final long f10441c;

    public q(long j10, long j11, long j12) {
        this.f10439a = j10;
        this.f10440b = j11;
        this.f10441c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f10439a == qVar.f10439a && this.f10441c == qVar.f10441c && this.f10440b == qVar.f10440b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10439a;
        long j11 = this.f10440b;
        long j12 = this.f10441c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f10439a + ", samplesPerChunk=" + this.f10440b + ", sampleDescriptionIndex=" + this.f10441c + '}';
    }
}
