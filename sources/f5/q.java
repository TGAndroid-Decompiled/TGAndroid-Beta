package f5;
public final class q {
    public final long f9709a;
    public final long f9710b;
    public final long f9711c;

    public q(long j3, long j10, long j11) {
        this.f9709a = j3;
        this.f9710b = j10;
        this.f9711c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f9709a == qVar.f9709a && this.f9711c == qVar.f9711c && this.f9710b == qVar.f9710b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9709a;
        long j10 = this.f9710b;
        long j11 = this.f9711c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f9709a + ", samplesPerChunk=" + this.f9710b + ", sampleDescriptionIndex=" + this.f9711c + '}';
    }
}
