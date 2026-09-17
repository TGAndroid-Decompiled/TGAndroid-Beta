package f5;
public final class q {
    public final long f9333a;
    public final long f9334b;
    public final long f9335c;

    public q(long j3, long j10, long j11) {
        this.f9333a = j3;
        this.f9334b = j10;
        this.f9335c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f9333a == qVar.f9333a && this.f9335c == qVar.f9335c && this.f9334b == qVar.f9334b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9333a;
        long j10 = this.f9334b;
        long j11 = this.f9335c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f9333a + ", samplesPerChunk=" + this.f9334b + ", sampleDescriptionIndex=" + this.f9335c + '}';
    }
}
