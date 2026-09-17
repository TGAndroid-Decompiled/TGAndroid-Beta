package f5;
public final class q {
    public final long f8941a;
    public final long f8942b;
    public final long f8943c;

    public q(long j3, long j10, long j11) {
        this.f8941a = j3;
        this.f8942b = j10;
        this.f8943c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8941a == qVar.f8941a && this.f8943c == qVar.f8943c && this.f8942b == qVar.f8942b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8941a;
        long j10 = this.f8942b;
        long j11 = this.f8943c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8941a + ", samplesPerChunk=" + this.f8942b + ", sampleDescriptionIndex=" + this.f8943c + '}';
    }
}
