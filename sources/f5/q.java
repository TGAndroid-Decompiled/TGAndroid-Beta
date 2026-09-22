package f5;
public final class q {
    public final long f8940a;
    public final long f8941b;
    public final long f8942c;

    public q(long j3, long j10, long j11) {
        this.f8940a = j3;
        this.f8941b = j10;
        this.f8942c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8940a == qVar.f8940a && this.f8942c == qVar.f8942c && this.f8941b == qVar.f8941b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8940a;
        long j10 = this.f8941b;
        long j11 = this.f8942c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8940a + ", samplesPerChunk=" + this.f8941b + ", sampleDescriptionIndex=" + this.f8942c + '}';
    }
}
