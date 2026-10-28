package g5;
public final class q {
    public final long f12329a;
    public final long f12330b;
    public final long f12331c;

    public q(long j10, long j11, long j12) {
        this.f12329a = j10;
        this.f12330b = j11;
        this.f12331c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f12329a == qVar.f12329a && this.f12331c == qVar.f12331c && this.f12330b == qVar.f12330b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f12329a;
        long j11 = this.f12330b;
        long j12 = this.f12331c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f12329a + ", samplesPerChunk=" + this.f12330b + ", sampleDescriptionIndex=" + this.f12331c + '}';
    }
}
