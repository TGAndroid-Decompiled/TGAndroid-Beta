package f5;
public final class q {
    public final long f8926a;
    public final long f8927b;
    public final long f8928c;

    public q(long j3, long j10, long j11) {
        this.f8926a = j3;
        this.f8927b = j10;
        this.f8928c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8926a == qVar.f8926a && this.f8928c == qVar.f8928c && this.f8927b == qVar.f8927b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8926a;
        long j10 = this.f8927b;
        long j11 = this.f8928c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8926a + ", samplesPerChunk=" + this.f8927b + ", sampleDescriptionIndex=" + this.f8928c + '}';
    }
}
