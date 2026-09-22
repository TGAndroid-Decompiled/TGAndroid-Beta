package f5;
public final class q {
    public final long f8938a;
    public final long f8939b;
    public final long f8940c;

    public q(long j3, long j10, long j11) {
        this.f8938a = j3;
        this.f8939b = j10;
        this.f8940c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8938a == qVar.f8938a && this.f8940c == qVar.f8940c && this.f8939b == qVar.f8939b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8938a;
        long j10 = this.f8939b;
        long j11 = this.f8940c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8938a + ", samplesPerChunk=" + this.f8939b + ", sampleDescriptionIndex=" + this.f8940c + '}';
    }
}
