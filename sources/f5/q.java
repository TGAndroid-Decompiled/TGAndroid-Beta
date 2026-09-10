package f5;
public final class q {
    public final long f7823a;
    public final long f7824b;
    public final long f7825c;

    public q(long j3, long j10, long j11) {
        this.f7823a = j3;
        this.f7824b = j10;
        this.f7825c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f7823a == qVar.f7823a && this.f7825c == qVar.f7825c && this.f7824b == qVar.f7824b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f7823a;
        long j10 = this.f7824b;
        long j11 = this.f7825c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f7823a + ", samplesPerChunk=" + this.f7824b + ", sampleDescriptionIndex=" + this.f7825c + '}';
    }
}
