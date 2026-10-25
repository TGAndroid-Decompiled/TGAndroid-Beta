package g5;
public final class q {
    public final long f12330a;
    public final long f12331b;
    public final long f12332c;

    public q(long j10, long j11, long j12) {
        this.f12330a = j10;
        this.f12331b = j11;
        this.f12332c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f12330a == qVar.f12330a && this.f12332c == qVar.f12332c && this.f12331b == qVar.f12331b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f12330a;
        long j11 = this.f12331b;
        long j12 = this.f12332c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f12330a + ", samplesPerChunk=" + this.f12331b + ", sampleDescriptionIndex=" + this.f12332c + '}';
    }
}
